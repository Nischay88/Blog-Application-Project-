# 🌟 Blog Application - Spring Boot REST API

<div align="center">

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.3-brightgreen.svg)
![Java](https://img.shields.io/badge/Java-17-orange.svg)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue.svg)
![License](https://img.shields.io/badge/License-MIT-green.svg)

*A comprehensive Blogging Application built with Spring Boot REST APIs*

[📖 Live Demo](#) • [📚 API Documentation](#api-documentation) • [🚀 Quick Start](#getting-started)

</div>

---

## 📋 Table of Contents

- [✨ Features](#features)
- [🛠 Tech Stack](#tech-stack)
- [🏗 Architecture](#architecture)
- [🚀 Getting Started](#getting-started)
- [📊 Database Schema](#database-schema)
- [🔗 API Endpoints](#api-endpoints)
- [🔐 Authentication](#authentication)
- [📁 Project Structure](#project-structure)
- [🧪 Testing](#testing)
- [🤝 Contributing](#contributing)
- [📄 License](#license)

---

## ✨ Features

<div align="center">

### 🎯 Core Features
| Feature | Description |
|---------|-------------|
| 📝 **Blog Management** | Create, read, update, delete blog posts |
| 🏷️ **Category System** | Organize posts by categories |
| 💬 **Comments** | Interactive commenting system |
| 👤 **User Management** | User registration and authentication |
| 📤 **File Upload** | Image upload functionality |
| 📄 **Pagination** | Efficient data pagination |
| 🔍 **Search & Filter** | Advanced search capabilities |

### 🔒 Security & Authentication
- ✅ **Basic Authentication** (Database-backed)
- ✅ **Role-based Access Control**
- ✅ **Secure Password Hashing** (BCrypt)
- ✅ **Stateless Sessions**

### 📊 Data & Performance
- ✅ **MySQL Database Integration**
- ✅ **JPA/Hibernate ORM**
- ✅ **DTO Pattern** for data transfer
- ✅ **Swagger API Documentation**
- ✅ **Global Exception Handling**

</div>

---

## 🛠 Tech Stack

<div align="center">

### Backend Framework
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.3-6DB33F?style=for-the-badge&logo=spring-boot)
![Spring Security](https://img.shields.io/badge/Spring%20Security-6.1.0-6DB33F?style=for-the-badge&logo=spring-security)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-3.1.0-6DB33F?style=for-the-badge&logo=spring)

### Database & ORM
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql)
![Hibernate](https://img.shields.io/badge/Hibernate-6.2.0-59666C?style=for-the-badge&logo=hibernate)

### API & Documentation
![Swagger](https://img.shields.io/badge/Swagger-2.2.0-85EA2D?style=for-the-badge&logo=swagger)
![OpenAPI](https://img.shields.io/badge/OpenAPI-3.0-85EA2D?style=for-the-badge&logo=openapi-initiative)

### Development Tools
![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-3.8.6-C71A36?style=for-the-badge&logo=apache-maven)
![Lombok](https://img.shields.io/badge/Lombok-1.18.26-DC382D?style=for-the-badge&logo=lombok)

### Additional Libraries
- **ModelMapper** - Object mapping
- **Jackson** - JSON processing
- **Validation API** - Data validation

</div>

---

## 🏗 Architecture

```
📁 src/main/java/com/nischay/blog/app/
├── 📂 config/           # Configuration classes
│   ├── BasicSecurityConfiguration.java
│   ├── SwaggerConfig.java
│   └── ApplicationConstants.java
├── 📂 controller/       # REST Controllers
│   ├── AuthRestController.java
│   ├── PostRestController.java
│   ├── CategoryRestController.java
│   ├── UserRestController.java
│   ├── CommentController.java
│   └── FileRestController.java
├── 📂 entity/          # JPA Entities
│   ├── User.java
│   ├── Post.java
│   ├── Category.java
│   ├── Comment.java
│   └── Role.java
├── 📂 payloads/        # DTOs and Request/Response objects
│   ├── UserDto.java
│   ├── PostDto.java
│   ├── CategoryDto.java
│   ├── CommentDto.java
│   ├── LoginRequest.java
│   └── ApiResponse.java
├── 📂 repository/      # Data Access Layer
├── 📂 security/        # Security Configuration
├── 📂 services/        # Business Logic
└── 📂 exceptions/      # Global Exception Handling
```

---

## 🚀 Getting Started

### Prerequisites

<div align="center">

| Requirement | Version | Download |
|-------------|---------|----------|
| **Java** | 17+ | [Download JDK](https://adoptium.net/) |
| **MySQL** | 8.0+ | [Download MySQL](https://dev.mysql.com/downloads/mysql/) |
| **Maven** | 3.8+ | [Download Maven](https://maven.apache.org/download.cgi) |

</div>

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/nischay/blog-application-spring-boot-rest-api.git
   cd blog-application-spring-boot-rest-api
   ```

2. **Database Setup**
   ```sql
   CREATE DATABASE blog_app;
   ```

3. **Configure Database Connection**

   Update `src/main/resources/application.properties`:
   ```properties
   # Database Configuration
   spring.datasource.url=jdbc:mysql://localhost:3306/blog_app
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

   # JPA Configuration
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

   # File Upload Configuration
   spring.servlet.multipart.max-file-size=10MB
   spring.servlet.multipart.max-request-size=10MB
   project.image=images/
   ```

4. **Build and Run**
   ```bash
   # Build the project
   mvn clean install

   # Run the application
   mvn spring-boot:run
   ```

5. **Access the Application**
   - **API Base URL**: `http://localhost:8080`
   - **Swagger UI**: `http://localhost:8080/swagger-ui.html`
   - **API Docs**: `http://localhost:8080/v3/api-docs`

---

## 📊 Database Schema

<div align="center">

### Enhanced Entity-Relationship Diagram

![Enhanced Entity-Relationship(EER-Diagram)](https://github.com/nischay/blog-application-spring-boot-rest-api/assets/91146041/85d1199f-5703-448c-a72e-80fe7a9bc1f5)

</div>

### Tables Overview

| Table | Description | Key Fields |
|-------|-------------|------------|
| **users** | User accounts | id, name, email, password, about |
| **roles** | User roles | id, name |
| **categories** | Blog categories | id, title, description |
| **posts** | Blog posts | id, title, content, image, date, user_id, category_id |
| **comments** | Post comments | id, content, user_id, post_id |

---

## 🔗 API Endpoints

<div align="center">

### 📋 Authentication Endpoints

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| `POST` | `/api/auth/login` | User login | ✅ Basic Auth |
| `POST` | `/api/auth/register` | User registration | ❌ Open |

### 📝 Post Management

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| `GET` | `/api/posts` | Get all posts (paginated) | ❌ Open |
| `GET` | `/api/posts/{id}` | Get post by ID | ❌ Open |
| `POST` | `/api/user/{userId}/category/{categoryId}/posts` | Create new post | ❌ Open |
| `PUT` | `/api/posts/{id}` | Update post | ❌ Open |
| `DELETE` | `/api/posts/{id}` | Delete post | ❌ Open |
| `GET` | `/api/posts/search/{keyword}` | Search posts | ❌ Open |

### 🏷️ Category Management

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| `GET` | `/api/categories` | Get all categories | ❌ Open |
| `GET` | `/api/categories/{id}` | Get category by ID | ❌ Open |
| `POST` | `/api/categories` | Create category | ❌ Open |
| `PUT` | `/api/categories/{id}` | Update category | ❌ Open |
| `DELETE` | `/api/categories/{id}` | Delete category | ❌ Open |

### 👤 User Management

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| `GET` | `/api/users` | Get all users | ❌ Open |
| `GET` | `/api/users/{id}` | Get user by ID | ❌ Open |
| `POST` | `/api/users` | Create user | ❌ Open |
| `PUT` | `/api/users/{id}` | Update user | ❌ Open |
| `DELETE` | `/api/users/{id}` | Delete user | ❌ Open |

### 💬 Comment System

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| `GET` | `/api/comments` | Get all comments | ❌ Open |
| `GET` | `/api/comments/{id}` | Get comment by ID | ❌ Open |
| `POST` | `/api/posts/{postId}/comments` | Create comment | ❌ Open |
| `PUT` | `/api/comments/{id}` | Update comment | ❌ Open |
| `DELETE` | `/api/comments/{id}` | Delete comment | ❌ Open |

### 📤 File Upload

| Method | Endpoint | Description | Auth Required |
|--------|----------|-------------|---------------|
| `POST` | `/api/file/upload` | Upload image file | ❌ Open |

</div>

---

## 🔐 Authentication

### Basic Authentication Setup

For the login endpoint, use Basic Authentication:

```bash
# Format: Authorization: Basic base64(username:password)
curl -X POST http://localhost:8080/api/auth/login \
  -H "Authorization: Basic dXNlcjpwYXNzd29yZA==" \
  -H "Content-Type: application/json" \
  -d '{"email":"user@example.com","password":"password123"}'
```

### Current Security Model

- **✅ Open Access**: All endpoints are publicly accessible
- **🔐 Login Only**: Only `/api/auth/login` requires Basic Authentication
- **🗄️ Database Auth**: User credentials validated against MySQL database
- **🔒 Password Security**: BCrypt password hashing

---

## 📁 Project Structure

```
blog-application-springboot-rest-apis/
├── 📂 src/main/java/com/nischay/blog/app/
│   ├── 📂 config/           # Configuration classes
│   ├── 📂 controller/       # REST API controllers
│   ├── 📂 entity/          # JPA entity classes
│   ├── 📂 exceptions/      # Exception handlers
│   ├── 📂 payloads/        # DTOs and API models
│   ├── 📂 repository/      # JPA repositories
│   ├── 📂 security/        # Security configuration
│   └── 📂 services/        # Business logic services
├── 📂 src/main/resources/
│   ├── application.properties
│   └── 📂 images/          # Uploaded images storage
├── 📂 src/test/            # Test classes
├── pom.xml                 # Maven configuration
└── README.md              # Project documentation
```

---

## 🧪 Testing

### Run Tests
```bash
# Run all tests
mvn test

# Run with coverage
mvn test jacoco:report
```

### API Testing Examples

#### Register a new user
```bash
curl -X POST http://localhost:8080/api/auth/register \
  -H "Content-Type: application/json" \
  -d '{
    "name": "John Doe",
    "email": "john@example.com",
    "password": "password123",
    "about": "A passionate blogger"
  }'
```

#### Login
```bash
curl -X POST http://localhost:8080/api/auth/login \
  -H "Authorization: Basic am9objpwYXNzd29yZDEyMw==" \
  -H "Content-Type: application/json" \
  -d '{"email":"john@example.com","password":"password123"}'
```

#### Create a category
```bash
curl -X POST http://localhost:8080/api/categories \
  -H "Content-Type: application/json" \
  -d '{
    "categoryTitle": "Technology",
    "categoryDescription": "Latest tech news and tutorials"
  }'
```

#### Create a post
```bash
curl -X POST http://localhost:8080/api/user/1/category/1/posts \
  -H "Content-Type: application/json" \
  -d '{
    "title": "My First Blog Post",
    "content": "This is the content of my first blog post...",
    "imageName": "default.png"
  }'
```

---

## 🤝 Contributing

<div align="center">

### 📋 Contribution Guidelines

We welcome contributions! Please follow these steps:

1. **Fork the repository**
2. **Create a feature branch** (`git checkout -b feature/AmazingFeature`)
3. **Commit your changes** (`git commit -m 'Add some AmazingFeature'`)
4. **Push to the branch** (`git push origin feature/AmazingFeature`)
5. **Open a Pull Request**

### 🐛 Bug Reports & Feature Requests

- **Bug Reports**: [Create an issue](https://github.com/nischay/blog-application-spring-boot-rest-api/issues)
- **Feature Requests**: [Create an issue](https://github.com/nischay/blog-application-spring-boot-rest-api/issues)
- **Questions**: [Start a discussion](https://github.com/nischay/blog-application-spring-boot-rest-api/discussions)

</div>

---

## 📄 License

<div align="center">

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2024 Nischay

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
```

</div>

---

<div align="center">

### 🙏 Acknowledgments

- **Spring Boot Team** for the amazing framework
- **Spring Community** for excellent documentation
- **Open Source Contributors** for their valuable contributions

---

**Made with ❤️ by [Nischay](https://github.com/nischay)**

⭐ **Star this repository** if you found it helpful!

[⬆️ Back to Top](#blog-application---spring-boot-rest-api)

</div>

