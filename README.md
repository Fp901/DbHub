# DbHub – System Requirements Specification

**Module Code:** IMDCBM201
**Student Number:** S255073

## 📖 Introduction

DbHub is a Java desktop application designed for enterprise data management. It enables employees and administrators to interact with organizational data securely and efficiently through a graphical user interface (GUI).

This repository contains the **Software Requirements Specification (SRS)** for DbHub version 1.0, following the IEEE 830-1998 standard. The document details functionality, performance requirements, design constraints, and user interactions to guide development, testing, and deployment.

## 🎯 Purpose

The purpose of DbHub is to provide employees with an intuitive interface for managing data while digitising outdated filing systems. The software improves efficiency, reduces costs, and enhances data security within an enterprise environment.

## 🚀 Key Features (Planned)

* Input, retrieve, update, and delete records
* Role-based access (employee vs. administrator)
* Prepared statements to prevent SQL injection
* User logs and session expiry after inactivity
* Modular design following the MVC pattern

## 👥 Intended Audience

* **Development Team** – for design and implementation
* **Project Managers** – for scope and planning
* **QA Team** – for deriving test cases and ensuring quality
* **Stakeholders/Clients** – for understanding features and outcomes

## 🖥️ System Requirements

### Hardware

* **Minimum:** Intel i5, 4GB RAM, 256GB storage, integrated graphics
* **Recommended:** Intel i7, 8GB RAM, 512GB storage, dedicated GPU

### Software

* **OS:** Windows 11
* **JRE:** Java SE Runtime Environment v21
* **Database:** MySQL 8.0
* **IDE:** IntelliJ IDEA
* **Dependencies:** Maven, JDBC, JUnit, JavaFX, slf4j

## 📌 Functional Requirements (examples)

* **FR-001:** Users should be able to log in with username and password
* **FR-002:** Users should be able to input data
* **FR-003:** Users should be able to retrieve specific data
* **FR-005:** Users should be able to delete a row from a table
* **FR-009:** Sessions expire after 25 minutes of inactivity

## 📌 Non-Functional Requirements (examples)

* **Performance:** Load table data within 3 seconds
* **Security:** Store passwords with encryption
* **Reliability:** Maintain 90% uptime monthly
* **Usability:** GUI must be intuitive and user-friendly
* **Maintainability:** Modular, well-commented code

## 📚 Glossary

* **DbHub:** Enterprise data management desktop app
* **SRS:** Software Requirements Specification
* **GUI:** Graphical User Interface
* **JDBC:** Java Database Connectivity
* **MVC:** Model-View-Controller design pattern
