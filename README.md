# URL Shortener - Spring Boot Side Project 🚀


New things learned:
Databases in Spring Boot:
-Database(SQL)
-JDBC
-JPA
-Hibernate
-Spring Data JPA

N + 1 select problem

1. Dependency Injection

Flyway Data Database manager (with Migration features)

# Implement Service Layer Pattern:

Service Layer Pattern, which promotes clean architecture and separation of concerns.

Business logic will be in Service classes
Database communication only in repository
Server-client communication through Controller
Repository -> DTO -> Entity -> Service // wrong
[Controller]
|
v
DTOs
|
v
[Service]
|
v
[Entity] <-> [Repository]


Client (HTTP) ──> Controller ──> Service ──> Repository ──> Database
↑ ↓ ↑
DTO DTO Entity

potential improvements:
Better frontend tool

2. Handling of duplicate form submission with Post/Redirect/Get pattern
3. Spring Boot Database ecosystem and Tools
   -Database(SQL)
   -JDBC
   -JPA
   -Hibernate
   -Spring Data JPA
4. N + 1 Select Problems
