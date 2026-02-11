# 🍽️ Restaurant Billing System

## 📌 Project Overview

This project is a **Restaurant Billing System** developed using **HTML, CSS, Spring Boot, Thymeleaf, Java REST APIs, and SQL**. The application allows a customer to enter their name, browse available items with prices, add items to a cart, view the total bill, and choose whether the payment has been completed or not. All billing and cart details are stored in the database.

The project is designed to demonstrate **full-stack development** using Spring Boot with server-side rendering and database integration.

🌐 **Live Demo:**  
🔗 [Click Here to Try the App](https://quickbill-restaurant-billing-system-2.onrender.com)


🎥 **Video Demo:**  
https://drive.google.com/file/d/1HlbMjUIbiPyUozH2xNkXCqopRa0EuCuQ/view?usp=drive_link

---

## 🚀 Features

- User enters **Customer Name** to start shopping
- Displays **All Items with Prices** on the next UI
- Customer can select items and quantities
- **Automatic total bill calculation**
- Option to select **Payment Status (Paid / Not Paid)**
- Save bill details into **SQL Database**
- Clear cart if the user does not want to save the bill

### Database stores:
- Customer details
- Cart items (what items & quantities were taken)
- Total bill amount
- Payment status

---

## 🧑‍💻 Tech Stack

### Frontend
- HTML
- CSS
- JavaScript
- Thymeleaf

### Backend
- Java
- Spring Boot
- Spring Data JPA
- REST APIs

### Database
- SQL (MySQL / H2 for local development)
- Railway Cloud SQL (Production Database)

---

## 🌍 Deployment

- Application deployed on **Render**
- Production database hosted on **Railway Cloud SQL**
- Environment variables configured for secure database connection

---

## 🏗️ Application Flow

### 1️⃣ Home Page
- User enters their name

### 2️⃣ Items Page
- Displays all available items with prices
- User selects items and quantity

### 3️⃣ Billing 
- Shows selected items
- Displays total bill amount
- User selects payment status (Paid / Not Paid)

### 4️⃣ Save or Clear
- Save bill → Data stored in SQL database
- Clear bill → Cart cleared, no data saved

### 5️⃣ Database Records
- Cart items
- Customer details
- Total amount
- Payment status

---

## 🗄️ Database Design (Example)

### Customer Table
- id
- customer_name
- total_bill
- payment_status

### Cart_Item Table
- id
- item_name
- price
- quantity
- total
- customer_id (Foreign Key)

---

## ⚙️ Setup & Installation

### Prerequisites
- Java 8 or above
- Maven
- SQL Database (MySQL / H2 etc.)
- IDE (IntelliJ / Eclipse / VS Code)

### Steps

1️⃣ Clone the repository

```bash
git clone https://github.com/rinkumahajan2002-cmyk/QuickBill-Restaurant-Billing-System.git
```

2️⃣ Open project in IDE

3️⃣ Configure database in `application.properties`

4️⃣ Run the Spring Boot application

```bash
mvn spring-boot:run
```

5️⃣ Open browser and visit:

```
http://localhost:8085
```

## 🎯 Future Enhancements

- User authentication (Login / Signup)
- Admin panel to manage items
- PDF bill generation
- Online payment gateway integration
---

## 🤝 Contribution

Contributions are welcome! Feel free to fork the repository and submit a pull request.

---

## 📄 License

This project is for **learning and educational purposes**.

---

## 🙌 Author

**Rinku Mahajan**  
🔗 GitHub: https://github.com/rinkumahajan2002-cmyk
📧 Email: rinkumahajan2002@gmail.com

---

⭐ If you like this project, don’t forget to give it a star on GitHub!
