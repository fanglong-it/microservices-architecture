# Microservice Architecture Project

This project demonstrates a simple microservice architecture with the following services:

- **Eureka Server**: Service Discovery using Spring Cloud Eureka
- **Product Service**: Manages products and product-related operations
- **User Service**: Manages user data and operations
- **Order Service**: Handles order processing and related operations

## Technologies Used

- **Spring Boot 3.4.5**: Java framework for building microservices
- **Spring Cloud**: For service discovery, configuration management, etc.
- **Eureka Server**: For service discovery
- **Spring Web**: For creating RESTful APIs

## Services Overview

### 1. Eureka Server (Service Discovery)
- Eureka Server acts as the service registry where all microservices register themselves for service discovery.
- URL: `http://localhost:8761`

### 2. Product Service
- Manages product data, including creating, updating, and deleting products.
- Provides RESTful APIs for interacting with product data.
- Registers itself with Eureka Server for discovery.

### 3. User Service
- Manages user data and profiles.
- Provides endpoints for user creation, profile updates, and querying user details.
- Registers with Eureka Server.

### 4. Order Service
- Handles order management.
- Facilitates order creation, updating, and tracking.
- Communicates with Product and User Services over HTTP (RESTful API).

## Project Setup

### 1. Clone the repository
```bash
git clone https://github.com/fanglong-it/microservice-architecture.git
cd microservice-architecture
