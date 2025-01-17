
# Student RESTful API with Spring Boot 3 and Java 21

This repository contains a simple RESTful API for managing student data, implemented using Spring Boot 3 and Java 21. The project demonstrates a Spring Boot application's basic structure and functionality with a sample `Student` entity.

---

## Features

- **CRUD Operations**: Create, Read, Update, and Delete students.
- **RESTful Endpoints**: Exposes APIs for managing student data.
- **Spring Boot 3**: Utilizes the latest features of Spring Boot.
- **Java 21**: Leverages the latest features and improvements in Java 21.

---

## Getting Started

### Prerequisites

Ensure you have the following installed:
- Java 21 or later
- Maven or Gradle (Maven is used in this project)
- An IDE like IntelliJ IDEA or Eclipse for development

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-rest-api.git
   ```
2. Navigate to the project directory:
   ```bash
   cd student-rest-api
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```

### Running the Application

To start the application, use the following command:
```bash
mvn spring-boot:run
```
The API will be available at `http://localhost:8080`.

---

## API Endpoints

| Method | Endpoint              | Description                 |
|--------|-----------------------|-----------------------------|
| GET    | `/api/students`       | Fetch all students          |
| GET    | `/api/students/{id}`  | Fetch a student by ID       |
| POST   | `/api/students`       | Add a new student           |
| PUT    | `/api/students/{id}`  | Update a student by ID      |
| DELETE | `/api/students/{id}`  | Delete a student by ID      |

---

## Sample Entity

```java
@Data
public class Student {
   private int studentId;
    private String name;
    private int grade;

    // Used Lombok for Getter and setters
}
```

---

## Technologies Used

- **Spring Boot 3**
- **Java 21**

---


