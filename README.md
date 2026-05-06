# ShoeMart - Backend API

![Java](https://img.shields.io/badge/Java-25-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.6-6DB33F?style=for-the-badge&logo=spring-boot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven)

Welcome to the heart of **ShoeMart**! This robust Spring Boot backend powers the premium footwear e-commerce experience, handling everything from inventory management to secure order processing and professional reporting.

---

## 🚀 Key Features

- **🛡️ Secure Auth**: Multi-role authentication (Admin/User) for tailored dashboard experiences.
- **📦 Inventory Management**: Full CRUD operations for products with category-based filtering.
- **🛒 Order Processing**: Real-time order placement with dedicated `order_items` persistence.
- **📄 Professional Reporting**: Data endpoints designed for luxury PDF receipt and sales report generation.
- **🔄 Auto-Mapping**: Efficient DTO/Entity transformations powered by MapStruct.

---

## 🛠️ Technology Stack

| Technology | Purpose |
| :--- | :--- |
| **Spring Boot 4.0.6** | High-performance enterprise application framework |
| **Java 25** | Cutting-edge language features and performance |
| **Spring Data JPA** | Seamless database interaction and abstraction |
| **PostgreSQL** | Reliable, production-grade relational storage |
| **MapStruct** | Type-safe bean mapping for clean DTO separation |
| **Lombok** | Boilerplate reduction for cleaner models |

---

## 📂 Project Architecture

The system follows a strict **Layered Architecture** for maximum maintainability:

- `🎮 Controller`: REST endpoints handling HTTP requests.
- `🧠 Service`: Core business logic and transaction management.
- `💾 Repository`: Data access layer for PostgreSQL.
- `📦 Model`: Clean separation between JPA Entities and DTOs.
- `🗺️ Mapper`: Sophisticated object mapping logic.

---

## 📑 API Endpoints Summary

### 🛒 Product Operations
- `GET /api/products` - List all footwear inventory.
- `POST /api/products` - Add new premium stock.
- `PUT /api/products/{id}` - Update stock details or pricing.

### 🧾 Order Management
- `POST /api/orders` - Securely place a customer order.
- `GET /api/orders` - Fetch full sales history for administrative reporting.

### 👤 User & Auth
- `POST /api/users/admin-login` - Secure entry to the luxury admin dashboard.
- `POST /api/users/login` - Standard customer authentication.

---

## 🛠️ Setup & Installation

1. **Database Setup**: Ensure PostgreSQL is running and create `shoemart_db`.
2. **Environment**: Update `src/main/resources/application.properties` with your credentials.
3. **Launch**:
   ```bash
   ./mvnw spring-boot:run
   ```

---