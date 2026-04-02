# Event Management API

Spring Boot REST API for managing event records with JPA, MySQL persistence, and CRUD-style layered DAL/service architecture.

## Overview

This project demonstrates a compact Spring Boot event-management API built with a straightforward layered design. It focuses on creating, retrieving, updating, and deleting event records using Spring Boot, Hibernate, and MySQL, making it a clean learning project for CRUD-style REST and JPA integration.

## Concepts and Features Covered

- Spring Boot REST API setup
- JPA and Hibernate-based persistence
- Layered controller, service, and DAL design
- `GET` endpoint for retrieving an event by ID
- `GET` endpoint for listing all events
- `POST` endpoint for saving an event
- `PUT` endpoint for updating an event
- `DELETE` endpoint for removing an event by ID
- MySQL-backed data persistence with automatic schema update

## Tech Stack

- Java 17
- Spring Boot 2.7
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- JUnit 5

## Project Structure

```text
event-management-api/
├── CHANGELOG.md
├── README.md
├── pom.xml
├── mvnw
├── mvnw.cmd
└── src/
    └── main/
        ├── java/com/cn/cnEvent/
        │   ├── controller/
        │   ├── dal/
        │   ├── entity/
        │   ├── service/
        │   └── EventManagerApplication.java
        └── resources/
            └── application.yml
```

## How to Run

1. Open a terminal in the project root.
2. Update the MySQL connection values in `src/main/resources/application.yml` if needed.
3. Run `mvn test`.
4. Run `mvn spring-boot:run`.
5. Use the API under `http://localhost:8081/event`.

Available endpoints:

- `GET /event/{id}`
- `GET /event/all`
- `POST /event/save`
- `PUT /event/update`
- `DELETE /event/delete/{id}`

Example request body:

```json
{
  "name": "Tech Meetup",
  "description": "Community event for Java and Spring developers"
}
```

## Learning Highlights

- Demonstrates a compact end-to-end Spring Boot REST and JPA setup
- Shows how to separate persistence concerns into a DAL layer
- Extends a simple create/read API into a fuller CRUD learning project
- Uses Hibernate sessions through `EntityManager` for event persistence
- Keeps the project intentionally focused so the core flow stays easy to understand

## GitHub Metadata

- Suggested repository description: `Spring Boot REST API for event record management with JPA, MySQL persistence, and CRUD-style layered DAL/service design.`
- Suggested topics: `java`, `java-17`, `spring-boot`, `spring-data-jpa`, `hibernate`, `mysql`, `rest-api`, `event-management`, `crud-api`, `maven`, `learning-project`, `portfolio-project`
