# Changelog

All notable changes to this project are documented in this file.

## [v2.0.0] - 2026-04-03

### Summary
Second version of the Event Management API that expands the project from basic create/read behavior into a fuller CRUD-style event management service.

### Highlights

- Added `DELETE /event/delete/{id}` for removing event records.
- Added `PUT /event/update` for updating existing event records.
- Extended the service and DAL layers with delete and update operations.
- Refreshed the README to present the project as a stronger CRUD and JPA learning showcase.

### Notes

This version improves the project's usefulness as a portfolio project by covering more of the typical event-record lifecycle.

## [v1.0.0] - 2026-04-03

### Summary
Initial publication of the Event Management API as a clean, portfolio-ready Spring Boot REST project.

### Highlights

- Added a recruiter-friendly README with API overview, features, run steps, and project structure.
- Added a changelog for future version tracking.
- Cleaned IDE files and build artifacts before publishing.
- Preserved the original event persistence and retrieval flow built on JPA and MySQL.

### Notes

This version establishes the project as a compact Spring Boot and JPA learning showcase for event record management.
