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

---

## 🏗️ Singleton Pattern (Creational)

![singleton](https://github.com/user-attachments/assets/b74dacf9-3879-4969-ac8a-7b2bfd4ca999)


### 📖 Overview

The **Singleton** pattern ensures that a class has only one instance throughout the application lifecycle and provides a global point of access to that instance. It controls object creation to prevent multiple instantiations and guarantees consistent access to shared resources or services.

This pattern is often used for managing configurations, logging, caches, or thread pools.

### 🔧 Purpose

- Restrict the instantiation of a class to a single object
- Provide a global, well-known access point to the instance
- Control concurrent access in multithreaded environments (when needed)
- Manage shared resources consistently

---

### 🛠️ When to Use Singleton

- When exactly one instance of a class is needed throughout the application
- When you want to coordinate actions across the system via a shared resource or service
- When you want to implement centralized management of configurations or logging
- When object lifecycle and resource management require strict control

---

### 📚 Learn More

- 📄 **Medium Article – Creational Design Patterns: Singleton**: [Link](https://blog.stackademic.com/creational-patterns-singleton-a8405e2f3c02)
- 🎥 **YouTube Video – Singleton Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Singleton in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/creational/singleton)

---

## 🧱 Adapter Pattern (Structural)

![adapter](https://github.com/user-attachments/assets/463e5413-3433-48a1-b0a7-f58c53b411b6)


### 📖 Overview

The **Adapter** pattern allows incompatible interfaces to work together by acting as a bridge between them. It converts the interface of a class into another interface that the client expects. This is especially useful when integrating legacy code or third-party libraries that don’t match your current design.

The Adapter promotes reusability by enabling existing classes to be used without modification.

### 🔧 Purpose

- Translate one interface into another expected by the client
- Promote code reuse without altering existing classes
- Facilitate integration of incompatible or legacy components
- Adhere to the **Single Responsibility** and **Open/Closed** principles

---

### 🛠️ When to Use Adapter

- When you want to use an existing class, but its interface does not match what you need
- When integrating with third-party or legacy APIs
- When converting data or behavior between systems with different interfaces
- When refactoring old code to conform to a new architecture

---

### 📚 Learn More

- 📄 **Medium Article – Structural Design Patterns: Adapter**: [Link](https://blog.stackademic.com/structural-design-patterns-adapter-d5440ef352b2)
- 🎥 **YouTube Video – Adapter Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Adapter in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/structural/adapter)

---

## 🧱 Bridge Pattern (Structural)

![bridge](https://github.com/user-attachments/assets/b2706109-c8e9-4d14-a338-b65625dff915)


### 📖 Overview

The **Bridge** pattern decouples an abstraction from its implementation so that the two can evolve independently. It separates the object’s interface (abstraction) from its actual behavior (implementation) by using composition instead of inheritance.

This pattern is ideal when both the abstractions and their implementations are expected to change or grow over time.

### 🔧 Purpose

- Separate abstraction from implementation to allow independent evolution
- Avoid tight coupling between interface and implementation
- Promote flexibility and scalability through composition
- Comply with the **Open/Closed Principle** and **Single Responsibility Principle**

---

### 🛠️ When to Use Bridge

- When you want to avoid a proliferation of subclasses due to multiple dimensions of variation
- When abstraction and implementation should be able to vary independently
- When you need to switch implementations at runtime or use different implementations in different contexts
- When working with platforms, devices, or backends that may vary

---

### 📚 Learn More

- 📄 **Medium Article – Structural Design Patterns: Bridge**: [Link](https://blog.stackademic.com/structural-design-patterns-bridge-44d8dd6885cb)
- 🎥 **YouTube Video – Bridge Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Bridge in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/structural/bridge)

---

## 🧱 Composite Pattern (Structural)

![composite](https://github.com/user-attachments/assets/ae658bf3-8ca4-4d11-a253-10bb020e3767)


### 📖 Overview

The **Composite** pattern composes objects into tree-like structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly. This is useful when you need to work with recursive structures like file systems, UI components, or organizational charts.

It simplifies client code by abstracting away the difference between leaf and composite nodes.

### 🔧 Purpose

- Represent part-whole hierarchies with uniform interfaces
- Treat individual objects and groups of objects the same way
- Simplify recursive structures through polymorphism
- Promote consistency and transparency in object management

---

### 🛠️ When to Use Composite

- When you need to represent hierarchical structures (e.g., trees, folders, UI components)
- When clients should treat simple (leaf) and complex (composite) objects uniformly
- When you want to simplify code that deals with group/individual logic
- When operations should apply recursively across object structures

---

### 📚 Learn More

- 📄 **Medium Article – Structural Design Patterns: Composite**: [Link](https://blog.stackademic.com/structural-design-patterns-composite-646b758c0783)
- 🎥 **YouTube Video – Composite Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Composite in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/structural/composite)

---
## 🧱 Decorator Pattern (Structural)

![decorator](https://github.com/user-attachments/assets/dd9adaab-9cfc-426d-97ba-e9cc52328a0a)


### 📖 Overview

The **Decorator** pattern allows behavior to be added to individual objects dynamically, without affecting the behavior of other objects from the same class. It achieves this by wrapping objects with other objects that implement the same interface.

This pattern promotes flexibility and adheres to the **Open/Closed Principle**, making it a powerful alternative to subclassing for extending functionality.

### 🔧 Purpose

- Add new responsibilities to objects dynamically
- Avoid class explosion from too many subclasses
- Promote composition over inheritance
- Extend behavior without modifying the original object

---

### 🛠️ When to Use Decorator

- When you want to add behavior to objects without modifying their class
- When you want to avoid creating subclasses for every possible feature combination
- When extension should be applied to selected instances only
- When responsibilities need to be composed in various flexible combinations

---

### 📚 Learn More

- 📄 **Medium Article – Structural Design Patterns: Decorator**: [Link](https://blog.stackademic.com/structural-design-patterns-decorator-ff0c2aaf91d5)
- 🎥 **YouTube Video – Decorator Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Decorator in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/structural/decorator)

---

## 🧱 Facade Pattern (Structural)

![facade](https://github.com/user-attachments/assets/fda40fe4-fe7e-46d2-bf94-63406914792c)


### 📖 Overview

The **Facade** pattern provides a simplified, unified interface to a complex subsystem. It hides the complexities of the underlying components and exposes only the necessary parts to the client, making the system easier to use and understand.

It’s particularly useful in layered architectures or when working with legacy systems.

### 🔧 Purpose

- Simplify access to a complex subsystem
- Provide a cleaner, higher-level interface to reduce coupling
- Improve readability and maintainability by hiding internal details
- Support separation of concerns by encapsulating interactions

---

### 🛠️ When to Use Facade

- When working with a complex system or API that should be easier to use
- When you want to decouple a client from the internal workings of a subsystem
- When integrating legacy systems or external services with messy interfaces
- When enforcing a consistent interaction point for a subsystem

---

### 📚 Learn More

- 📄 **Medium Article – Structural Design Patterns: Facade**: [Link](https://blog.stackademic.com/structural-design-patterns-facade-d431c6acf866)
- 🎥 **YouTube Video – Facade Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Facade in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/structural/facade)

---

## 🧱 Flyweight Pattern (Structural)

![flyweight](https://github.com/user-attachments/assets/5ab0652d-14c2-4225-99a2-723c24aa048a)


### 📖 Overview

The **Flyweight** pattern is used to minimize memory usage or computational costs by sharing as much data as possible with similar objects. It separates intrinsic (shared) state from extrinsic (context-specific) state, allowing many objects to reuse common data.

This pattern is ideal when working with large numbers of similar objects, such as in graphical applications, text editors, or caching systems.

### 🔧 Purpose

- Reduce memory footprint by sharing common data between objects
- Improve performance when instantiating many similar objects
- Separate shared (intrinsic) and unique (extrinsic) state
- Promote efficient resource usage without sacrificing object-oriented design

---

### 🛠️ When to Use Flyweight

- When an application needs to create a large number of similar objects
- When object instantiation is costly in terms of memory or performance
- When most object data can be shared rather than duplicated
- When external state can be passed in to avoid storing it inside the object

---

### 📚 Learn More

- 📄 **Medium Article – Structural Design Patterns: Flyweight**: [Link](https://blog.stackademic.com/structural-design-patterns-flyweight-696a260f17ed)
- 🎥 **YouTube Video – Flyweight Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Flyweight in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/structural/flyweight)

---

## 🧱 Proxy Pattern (Structural)

### 📖 Overview

The **Proxy** pattern provides a surrogate or placeholder for another object to control access to it. It acts as an intermediary that can perform additional logic—such as lazy initialization, logging, access control, or remote access—before delegating requests to the actual object.

This pattern is useful when direct access to the real object is undesirable or costly.

### 🔧 Purpose

- Control access to an object
- Add additional behavior (e.g., caching, logging, security) without changing the real object
- Delay object creation or loading until it's actually needed (lazy loading)
- Represent remote objects or resource-intensive services transparently

---

### 🛠️ When to Use Proxy

- When you need to manage access to a resource-heavy or sensitive object
- When you want to introduce additional responsibilities (like logging or permissions) transparently
- When working with remote services (Remote Proxy) or expensive operations (Virtual Proxy)
- When you want to defer object instantiation until it's actually required

---

### 📚 Learn More

- 📄 **Medium Article – Structural Design Patterns: Proxy**: [Link](https://blog.stackademic.com/structural-design-patterns-proxi-a7fc90ac60b9)
- 🎥 **YouTube Video – Proxy Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Proxy in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/structural/proxy)


