# Event Management API

Spring Boot REST API for managing events and schedule details with JPA, MySQL persistence, validation-oriented exception handling, and layered DAL/service architecture.

## Overview

This project demonstrates a compact Spring Boot event-management API built with a straightforward layered design. It now manages both events and their schedule details, while also introducing custom exception handling and location-based event lookup, making it a stronger learning project for layered REST and JPA design.

## Concepts and Features Covered

- Spring Boot REST API setup
- JPA and Hibernate-based persistence
- Layered controller, service, and DAL design
- `GET` endpoint for retrieving an event by ID
- `GET` endpoint for listing all events
- `POST` endpoint for saving an event
- `PUT` endpoint for updating an event
- `DELETE` endpoint for removing an event by ID
- One-to-one event and schedule-detail mapping
- `GET` endpoint for retrieving schedule details by ID
- `DELETE` endpoint for removing schedule details by ID
- `GET` endpoint for filtering events by location
- Custom exception handling for missing, duplicate, and invalid input cases
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
        │   ├── exception/
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
- `GET /event/eventScheduleDetail/{id}`
- `DELETE /event/delete/eventScheduleDetail/{id}`
- `GET /event/location/{location}`

Example request body:

```json
{
  "name": "Tech Meetup",
  "description": "Community event for Java and Spring developers",
  "eventScheduleDetail": {
    "location": "Bengaluru",
    "date": "2026-04-10",
    "time": "10:00 AM"
  }
}
```

## Learning Highlights

- Demonstrates a compact end-to-end Spring Boot REST and JPA setup
- Shows how to separate persistence concerns into a DAL layer
- Extends a simple event API into a richer event-and-schedule management workflow
- Introduces one-to-one entity mapping for schedule detail association
- Adds custom exceptions to make invalid and not-found scenarios more explicit
- Keeps the project intentionally focused so the core flow stays easy to understand

## GitHub Metadata

- Suggested repository description: `Spring Boot REST API for event and schedule-detail management with JPA, MySQL persistence, layered DAL/service design, and custom exception handling.`
- Suggested topics: `java`, `java-17`, `spring-boot`, `spring-data-jpa`, `hibernate`, `mysql`, `rest-api`, `event-management`, `crud-api`, `exception-handling`, `maven`, `learning-project`, `portfolio-project`
