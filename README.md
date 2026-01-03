# University Management System using Hibernate ORM

A Java-based University Management System developed using Hibernate ORM to demonstrate
Object-Relational Mapping (ORM), database connectivity, and DAO design patterns.

This project was developed as part of the **EEI4362 – Object Oriented Design** module at  
**The Open University of Sri Lanka (OUSL)**.

---

## 🚀 Technologies Used

- Java SE 18
- Hibernate ORM 6.1.7.Final
- Maven
- MySQL (XAMPP / WAMP)
- Eclipse IDE
- Jakarta Persistence API (JPA)

---

## 📌 Features

- Student entity mapping using JPA annotations
- Hibernate-based CRUD operations
- DAO design pattern implementation
- Advanced queries:
  - Retrieve students by degree program
  - Retrieve top-performing students by GPA
- Clean, modular, and scalable project structure

---

## 🗄️ Database Structure

**Database Name:** `university_db`

**Table:** `student`

| Column Name     | Type        |
|-----------------|------------|
| id              | INT (PK)   |
| name            | VARCHAR    |
| email           | VARCHAR    |
| degree_program  | VARCHAR    |
| gpa             | DOUBLE     |

---

## ⚙️ How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/nethinduhansaka-dev/university-management-system-hibernate.git


2. Open the project in **Eclipse IDE**

3. Configure MySQL:

   * Start XAMPP / WAMP
   * Create database `university_db`

4. Update database credentials in `HibernateUtil.java` if needed

5. Run:

   ```java
   main.UniversityApp
   ```

---

## 📚 Learning Outcomes

* Practical understanding of Hibernate ORM
* Hands-on experience with JPA annotations
* DAO pattern implementation
* Java–MySQL integration using Hibernate
* Writing clean, exam-ready, industry-standard code

---

## 👨‍💻 Author

**Nethindu Hansaka**
Software Engineering Undergraduate
The Open University of Sri Lanka



⭐ If you find this project useful, feel free to star the repository!


cc