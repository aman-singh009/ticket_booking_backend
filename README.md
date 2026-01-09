# 🎟️ Ticket Booking Backend

A backend REST API for a Ticket Booking System built using **Java Spring Boot**.  
This project provides APIs for event management, ticket booking, user authentication, and booking operations.

---

## 🧠 Project Objective

This project is built to implement a scalable and secure backend for a ticket booking platform.  
It follows industry-standard backend architecture, REST API design, and authentication practices.

---

## 🧰 Tech Stack

### Backend
- Java  
- Spring Boot  
- Spring Web (REST APIs)  
- Spring Data JPA  
- Hibernate  
- MySQL / PostgreSQL  
- Maven  
- JWT Authentication  
- Docker (optional)

---

## 📁 Folder Structure

```bash
ticket_booking_backend/
│
├── .mvn/                 # Maven wrapper files
├── src/
│   ├── main/
│   │   ├── java/         # Java source code
│   │   └── resources/    # Application configs
│   └── test/             # Test cases
│
├── mvnw                  # Maven wrapper script
├── mvnw.cmd              # Windows Maven wrapper
├── pom.xml               # Maven project file
├── Dockerfile            # Docker config (optional)
├── docker-compose.yml   # Docker compose (optional)
└── README.md
```

## 🔌 Installation & Setup
### Step 1: Clone Repository
```bash
git clone https://github.com/aman-singh009/ticket_booking_backend.git
cd ticket_booking_backend
```
### Step 2: Database Setup

Create a database in MySQL or PostgreSQL.

Update application.properties:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/ticket_booking_db
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

spring.jpa.hibernate.ddl-auto=update
jwt.secret=your_jwt_secret
```

### Step 3: Build & Run Backend
```bash
./mvnw clean install
java -jar target/*.jar
```
Backend runs on:
```bash
http://localhost:8080
```

## 👤 Author

Aman Singh

GitHub: https://github.com/aman-singh009

LinkedIn: https://www.linkedin.com/in/javawithaman/

Portfolio: https://aman-webdev.netlify.app/

