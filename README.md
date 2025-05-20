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

## 🏗️Factory Method (Creational)

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

- 📄 **Medium Article – Creational Design Patterns: Factory Method**: [Link](https://medium.com/stackademic/creational-patterns-factory-method-1275963c95ac)
- 🎥 **YouTube Video – Factory Method Design Pattern Explained**: [Coming Soon](#)
- 📂 **See the Java implementation**: [Factory Method in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/creational/factory)

---

## 🏗️ Abstract Factory Pattern (Creational)

![abstract method](https://github.com/user-attachments/assets/1a33439e-e4b7-48b3-9952-77843ce25761)


### 📖 Overview

The **Abstract Factory** pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. It encapsulates a group of individual factories that have a common theme, ensuring that products created by one factory are compatible with each other.

This pattern promotes consistency among products and isolates the client from the details of concrete implementations.

### 🔧 Purpose

- Provide an interface for creating related objects without specifying their concrete classes
- Ensure that families of products are used together consistently
- Support **Open/Closed Principle** by allowing new product families to be introduced without changing existing code

---

### 🛠️ When to Use Abstract Factory

- When your system needs to work with multiple families of related products
- When you want to enforce that products from different families are not mixed
- When the client should be decoupled from the creation of objects
- When you want to isolate the concrete classes that are instantiated from the client code

---

### 📚 Learn More

- 📄 **Medium Article – Creational Design Patterns: Abstract Factory**: [Link](https://blog.stackademic.com/creational-patterns-abstract-factory-a704f0271111)
- 🎥 **YouTube Video – Abstract Factory Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Abstract Factory in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/creational/abstractfactory)

---

## 🏗️ Builder Pattern (Creational)

![builder](https://github.com/user-attachments/assets/1dd0e6d5-8909-466d-91d9-84b4be3e8583)


### 📖 Overview

The **Builder** pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations. It provides a step-by-step approach to build objects with many optional parameters or configurations, improving code readability and maintainability.

This pattern is especially useful when creating immutable objects or objects that require elaborate setup.

### 🔧 Purpose

- Construct complex objects step-by-step
- Allow different representations or configurations of the object
- Encapsulate the construction logic from the client
- Support immutable object creation with clarity

---

### 🛠️ When to Use Builder

- When an object requires numerous parameters, especially optional ones
- When you want to avoid constructors with too many parameters (telescoping constructors)
- When object construction involves multiple steps or complex assembly
- When you want to create immutable objects with flexible configurations

---

### 📚 Learn More

- 📄 **Medium Article – Creational Design Patterns: Builder**: [Link](https://blog.stackademic.com/creational-patterns-builder-d890e32d9862)
- 🎥 **YouTube Video – Builder Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Builder in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/creational/builder)

---

## 🏗️ Prototype Pattern (Creational)

![prototype](https://github.com/user-attachments/assets/7d87f1d6-3d10-4cb3-a3e8-4b082b92a2cb)


### 📖 Overview

The **Prototype** pattern creates new objects by cloning existing instances, rather than creating new objects from scratch. This approach is useful when object creation is costly or complex. By copying a prototype, you can produce new objects efficiently while preserving the original’s state.

It promotes flexibility by allowing objects to specify their own cloning mechanism.

### 🔧 Purpose

- Create new objects by copying existing ones
- Avoid the overhead of building complex objects from scratch
- Enable dynamic configuration and customization of cloned objects
- Decouple clients from specific classes of objects they need to instantiate

---

### 🛠️ When to Use Prototype

- When object creation is expensive or resource-intensive
- When you want to avoid subclasses and instead clone existing objects
- When the system should be independent of how its products are created, composed, and represented
- When you need to dynamically add or remove objects at runtime by cloning prototypes

---

### 📚 Learn More

- 📄 **Medium Article – Creational Design Patterns: Prototype**: [Link](https://blog.stackademic.com/creational-patterns-prototype-5d3acbd2941a)
- 🎥 **YouTube Video – Prototype Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Prototype in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/creational/prototype)

