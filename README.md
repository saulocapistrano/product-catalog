# Product Catalog API

A robust and scalable RESTful API developed in **Java 17** with **Spring Boot 3.4.4**, designed for managing a catalog of products. This project follows modern software engineering principles, such as **Clean Architecture**, **Domain-Driven Design (DDD)**, **Git Flow**, and includes support for observability, security, testability, and containerization.

---

## ✨ Main Features

- CRUD operations for product management
- Layered architecture with clear separation of concerns
- Version-controlled database migrations using **Liquibase**
- Dockerized application and PostgreSQL
- Environment-based configuration with Spring Profiles: `dev`, `test`, `prod`, `docker`
- Kafka and Spring AI dependencies pre-configured for future integration
- OpenAPI (Swagger) support for API documentation 

---

## ⚙ Tech Stack

| Layer                  | Technology                          |
|------------------------|--------------------------------------|
| Language               | Java 17                              |
| Framework              | Spring Boot 3.4.4                    |
| Build Tool             | Maven                                |
| Database               | PostgreSQL                           |
| Migrations             | Liquibase                            |
| Containerization       | Docker, Docker Compose               |
| Profiles               | `dev`, `test`, `prod`, `docker`     |
| AI Integration (future)| Spring AI with OpenAI support       |
| Messaging (future)     | Apache Kafka                         |
| Testing                | JUnit, Testcontainers                |
| Logging & Monitoring   | Spring Boot Actuator, Micrometer    |

---

## 🎓 Project Structure

```
com.prodcatalog
├── api
│   ├── controller
│   ├── exception
│   └── interface
├── application
│   ├── dto
│   ├── mapper
│   ├── service
│   └── usecase
├── config
├── core
├── domain
│   ├── model
│   ├── repository
│   └── service
├── infrastructure
│   ├── ai
│   ├── external
│   ├── kafka
│   └── persistence
└── resources
    ├── db.changelog
    ├── static
    ├── templates
    └── application-{env}.properties
```

---

## 🚀 Running the Project Locally with Docker

### 1. Clone the Repository
```bash
git clone https://github.com/your-org/product-catalog.git
cd product-catalog
```

### 2. Build the Application
```bash
./mvnw clean package -DskipTests
```

### 3. Start with Docker Compose
```bash
docker-compose up --build
```

> This will:
> - Create and initialize a PostgreSQL container
> - Build and run the Spring Boot application inside a Docker container
> - Apply Liquibase migrations automatically

### 4. Access the Application
```bash
http://localhost:8082
```

If port `8082` is unavailable, adjust the value in `docker-compose.yml` accordingly.

---

## 🔗 API Endpoints (coming soon)
- `GET /api/products`
- `POST /api/products`
- `PUT /api/products/{id}`
- `DELETE /api/products/{id}`

Full Swagger documentation to be enabled soon at:
```
http://localhost:8082/swagger-ui.html
```

---

## ⚖ Environments
- `application-dev.properties`: local development
- `application-test.properties`: test execution with Testcontainers
- `application-docker.properties`: Docker Compose environment
- `application-prod.properties`: production-ready configuration

---

## ⚙ Git Flow Branch Strategy
- `main`: production
- `develop`: latest dev features
- `feature/*`: new feature development
- `release/*`: release preparation
- `hotfix/*`: urgent fixes on production

To start a feature:
```bash
git flow feature start feature-name
```

To finish a feature:
```bash
git flow feature finish feature-name
```

---

## 🔧 Database Migrations with Liquibase

Main file: `db.changelog-master.yaml`

Changelog files are stored under:
```
src/main/resources/db.changelog/
```

Example:
```yaml
# db.changelog-master.yaml

databaseChangeLog:
  - include:
      file: db.changelog/01-create-table-product.yaml
```

---

## ✅ Next Steps
- Add Swagger/OpenAPI documentation
- Enable Spring Security with JWT
- Add tracing with OpenTelemetry
- Implement Product Category and Inventory modules
- Integrate Kafka events
- Deploy to **Google Cloud Run** with PostgreSQL on **Cloud SQL**
- Setup **CI/CD** with **GitHub Actions**

---

## 💼 Author
**Saulo José Neco Capistrano**


---

## 🌐 License
This project is licensed under the MIT License.

