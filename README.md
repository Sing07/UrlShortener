# URL Shortener - Spring Boot Side Project

A Spring Boot side project for learning and experimenting with URL shortening. Built to explore Spring Boot concepts and best practices in a practical way.

## Quick Overview

This project implements a URL shortener service using:

- Spring Boot for the backend
- Spring Data JPA + Hibernate for database operations
- Flyway for database migrations
- Clean architecture with Service Layer Pattern

## Architecture

```
Client (HTTP) ──> Controller ──> Service ──> Repository ──> Database
                    ↑    ↓          ↑
                   DTO   DTO      Entity
```

## Learning Notes 📝

### Key Concepts Explored

- Service Layer Pattern
    - Business logic in Service classes
    - Database communication in Repository
    - Server-client communication through Controller
- Database Management
    - Spring Boot Database ecosystem (SQL, JDBC, JPA, Hibernate)
    - Flyway for database migrations
    - N+1 select problem and solutions
- Best Practices
    - Dependency Injection
    - Post/Redirect/Get pattern
    - DTO pattern
    - Clean architecture

## Tech Stack

- Backend: Spring Boot, Spring Boot Web
- Database: Spring Data JPA, Spring JDBC, PostgreSQL, Flyway
- Frontend: Thymeleaf

### Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/urlshortener/
│   │       ├── controller/    # REST endpoints
│   │       ├── service/       # Business logic
│   │       ├── repository/    # Data access
│   │       ├── model/         # Entities & DTOs
│   │       └── config/        # Configuration
│   └── resources/
│       └── db/migration/      # Flyway migrations
```

## Future Ideas 💡

- Better frontend implementation
- Rate limiting
- URL validation
- Caching
- URL analytics
- User authentication
- API documentation
