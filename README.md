# 🎯 Design Patterns in Java

This repository introduces the most essential **Design Patterns in Java**, used by developers and architects to build flexible, scalable, and maintainable software. You’ll find categorized overviews, real-world use cases, and practical guidance based on modern best practices.

---

## 📘 What Are Design Patterns?

**Design patterns** are time-tested solutions to common software design problems. They are abstract templates for structuring code and guiding object interactions.

### Why They Matter

- 🧠 Promote shared vocabulary and design clarity
- 🏗️ Improve software scalability and maintainability
- 🔄 Reduce code duplication through reuse of solutions
- ♻️ Support key principles like **SOLID**, **OOP**, and **Clean Architecture**

Design patterns help developers make **better architectural decisions** and avoid reinventing the wheel.

---

## 🧩 Types of Design Patterns

Design patterns are typically divided into **three main categories**:

### 🛠️ Creational Patterns
Handle object instantiation and provide mechanisms to make creation more adaptable and decoupled.

- **Factory Method**
- **Abstract Factory**
- **Singleton**
- **Builder**
- **Prototype**

### 🧱 Structural Patterns
Focus on object composition and the relationships between entities to form larger structures.

- **Adapter**
- **Composite**
- **Decorator**
- **Facade**
- **Bridge**
- **Proxy**
- **Flyweight**

### 🔁 Behavioral Patterns
Manage communication and control flow between objects.

- **Strategy**
- **Observer**
- **Command**
- **State**
- **Template Method**
- **Chain of Responsibility**
- **Visitor**
- **Mediator**
- **Memento**

---

## 🏗️ Deep Dive: Factory Method (Creational)

![factory method](https://github.com/user-attachments/assets/2651e613-964d-437e-bd56-bb785e5ac30f)


### 📖 Overview

The **Factory Method** pattern defines an interface for creating an object but allows subclasses to decide which class to instantiate. It promotes loose coupling by eliminating the need to bind application-specific classes into your code.

Instead of using `new`, the client relies on a **factory method** to create an instance, which enhances flexibility and extensibility.

### 🔧 Purpose

- Defer object instantiation to subclasses
- Hide creation logic from the client
- Follow the **Open/Closed Principle** by making code open to extension, but closed to modification

---

### 🛠️ When to Use Factory Method

- You need to create objects without exposing the instantiation logic to the client
- The code should work with multiple types of related objects
- You want to follow the **Dependency Inversion Principle** (program to interfaces, not implementations)
- Instantiations vary based on configuration, context, or user input

---

### 📚 Learn More

- 📄 **Medium Article – Creational Design Patterns: Factory Method**: [Coming Soon](https://medium.com/stackademic/creational-patterns-factory-method-1275963c95ac)
- 🎥 **YouTube Video – Factory Method Design Pattern Explained**: [Coming Soon](#)

---
