# 📌 Smart AI Recommender System

## 🎯 Objective

The Smart AI Recommender System is a web-based application designed to help users find the most suitable AI tools based on their task description. It reduces confusion by recommending relevant tools along with their usage details.

---

## 🛠️ Technologies Used

### 🔹 Backend

* Java
* Spring Boot (Spring MVC, Spring Data JPA)

### 🔹 Frontend

* Thymeleaf
* HTML, CSS (Glassmorphism UI)
* Responsive Design (Media Queries)

### 🔹 Database

* MySQL

### 🔹 Authentication

* Spring Security
* Google OAuth 2.0 Login

---

## 🏗️ System Architecture

User → UI (Thymeleaf) → Controller → Service Layer → Database → Response → UI

---

## ⚙️ Modules in the System

### 1. User Input Module

* Accepts user task (e.g., “I want to edit videos”)

### 2. Recommendation Engine

* Processes input
* Matches keywords with tags
* Retrieves relevant tools

### 3. Result Display Module

* Displays recommended tools
* Shows tool name, description, and link
* Includes comparison table (if multiple tools)

### 4. Authentication Module

* Google Login using OAuth 2.0
* Secure access to recommendation feature

### 5. Feedback Module

* Users can submit feedback
* Stored in database

---

## 🧠 Core Logic Used

### 🔹 1. Keyword-Based Matching

* User input is split into words
* Words matched with tags in database

Example:
Input → “edit video”
Tags → video, edit

---

### 🔹 2. Tag Mapping Logic

* Many-to-many relationship between tools and tags
* Matching tags → mapped tools retrieved

---

### 🔹 3. Ranking Logic

* Tools are ranked based on:

  * Number of matching tags
* More matches = higher priority

Formula:
Score = Number of matched tags

---

### 🔹 4. Comparison Logic

* If multiple tools are found:

  * Display comparison table
  * Helps user choose best tool manually

---

## 🤖 Model Used

👉 This system does **NOT use a machine learning model**

Instead, it uses:

* Rule-based system
* Keyword matching logic
* Ranking algorithm

---

## 🧠 Type of Intelligence

Current System:

* Rule-Based Recommendation System

Future Upgrade:

* NLP-based intelligent system
* Machine Learning recommendations

---

## 💬 Feedback System

* Users submit feedback with rating
* Data stored in MySQL
* Helps improve future recommendations

---

## 🎨 UI/UX Features

* Glassmorphism design
* Responsive layout (mobile + desktop)
* Animated cards and buttons
* Fixed navbar with blur effect
* Clean and modern interface

---

## 📱 Responsiveness

* Media queries used
* Flexible grid layout
* Mobile-friendly buttons and inputs

---

## 🔐 Security Features

* Google OAuth login
* Session-based authentication
* Protected endpoints

---

## 🚀 Future Scope

* NLP-based recommendation system
* AI API integration
* Tool comparison with pros & cons
* User personalization
* Admin dashboard
* Feedback-based ranking

---

## 🏁 Conclusion

The Smart AI Recommender System is a scalable and user-friendly platform that simplifies the process of discovering AI tools. It demonstrates strong full-stack development skills and provides a foundation for future AI-based enhancements.

---
