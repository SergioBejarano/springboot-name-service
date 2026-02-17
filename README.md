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
