# Etapa de build: usa Maven con Temurin 17 para compilar el microservicio
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copia el descriptor primero para aprovechar las capas de dependencias cacheadas
COPY pom.xml .
RUN mvn -B dependency:go-offline

# Copia el código fuente y genera el JAR listo para producción (Render instalará las dependencias en esta etapa)
COPY src ./src
RUN mvn -B clean package -DskipTests

# Etapa final: imagen ligera solo con el runtime de Java 17
FROM eclipse-temurin:17-jre-jammy
ENV PORT=8080
WORKDIR /app

# Copia el artefacto empacado desde la etapa de build
COPY --from=build /app/target/name-service-0.0.1-SNAPSHOT.jar app.jar

# Render inyecta la variable PORT en tiempo de ejecución; exponemos el valor por defecto
EXPOSE 8080

# Arranca la aplicación Spring Boot
CMD ["java", "-jar", "app.jar"]
