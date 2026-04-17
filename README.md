# JavaSolutions

A Maven-based Java 17 project containing hands-on exercises and concept demos for:

- basic syntax and operators
- control flow and loops
- classes, objects, inheritance, and OOP
- array/list/map utility exercises

## Prerequisites

- Java 17 or newer
- Git

Maven is optional because this repository includes the Maven Wrapper (`mvnw` / `mvnw.cmd`).

## Quick Start

1. Clone the repository.
2. Build and run tests:

```bash
./mvnw clean test
```

On Windows:

```bat
mvnw.cmd clean test
```

## Common Commands

Compile:

```bash
./mvnw clean compile
```

Run all tests:

```bash
./mvnw test
```

Create JAR:

```bash
./mvnw clean package
```

Run a specific demo class (example):

```bash
./mvnw -q -DskipTests compile
java -cp target/classes JavaConcepts.DayMapper
```

## Project Layout

```text
src/main/java/
  JavaConcepts/                 -> utility-focused practice problems
  JavaContent/                  -> topic-wise Java concept demos
  org/example/                  -> small launch/demo entry points

src/test/java/
  JavaConcepts/                 -> unit tests for reusable utilities
```

## Quality Improvements Included

- Added **JUnit 5** test support in Maven.
- Added **Maven Enforcer** rules for Java/Maven version consistency.
- Refactored selected concept classes into reusable methods:
  - `DayMapper`
  - `CamelCaseConverter`
  - `Factorial`
  - `ReverseArray`
  - `ArrayListOperations`
- Added unit tests for the above utilities.
- Added repo hygiene files:
  - `.gitignore`
  - `.editorconfig`
  - `.gitattributes`
  - Maven Wrapper files

## Notes

This repository is practice-oriented, so many classes include direct `main` methods for quick experimentation. New reusable logic should be added as methods and covered by tests in `src/test/java`.
