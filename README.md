# Name Service

Simple Spring Boot microservice that exposes a REST endpoint returning the name of Sergio Bejarano.

## Requirements

- Java 17+
- Maven 3.9+

## How to run

```bash
mvn spring-boot:run
```

The service listens on `http://localhost:8080` (or the port defined by the `PORT` environment variable) and exposes:

- `GET /api/v1/name`

Response example:

```json
{
  "name": "Sergio Bejarano",
  "message": "Hi! My name is Sergio Bejarano."
}
```

## Tests

```bash
mvn clean verify
```


## Deployment of microservice in Railway
<img width="1551" height="420" alt="image" src="https://github.com/user-attachments/assets/6163eeea-5356-4792-8f9c-368cedec2aaa" />


<img width="1757" height="684" alt="image" src="https://github.com/user-attachments/assets/b9b78c97-6e48-43e0-8d61-78088d8489ba" />


## Deployment of microservice in Render

<img width="1231" height="470" alt="image" src="https://github.com/user-attachments/assets/98508153-67b2-41c0-befa-76e3e6d7c383" />

<img width="2878" height="1636" alt="image" src="https://github.com/user-attachments/assets/3723a9ca-a175-44c5-b456-9e47858e7918" />
