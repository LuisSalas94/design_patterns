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

![proxy](https://github.com/user-attachments/assets/ad033245-5862-4b17-81f5-adb955f743be)


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

---

## 🔗 Chain of Responsibility Pattern (Behavioral)

![chain of responsibility](https://github.com/user-attachments/assets/f7ed4d73-038d-4a30-8688-e90776f739e2)


### 📖 Overview

The **Chain of Responsibility** pattern allows a request to pass through a chain of handlers until one of them handles it. Each handler in the chain either processes the request or forwards it to the next handler. This decouples senders and receivers, promoting flexibility in assigning responsibilities.

It’s particularly useful when multiple objects can handle a request and you don’t want to hard-code the handler logic.

### 🔧 Purpose

- Decouple the sender of a request from its potential receivers
- Allow multiple objects a chance to handle the request
- Promote loose coupling and open-ended processing chains
- Enhance flexibility by dynamically changing the chain at runtime

---

### 🛠️ When to Use Chain of Responsibility

- When multiple objects can handle a request, but the handler isn’t known in advance
- When you want to process a request through multiple stages or filters
- When the set of handlers needs to be dynamic or configurable
- When you want to avoid tightly coupled conditional logic (e.g., large `if-else` or `switch` statements)

---

### 📚 Learn More

- 📄 **Medium Article – Behavioral Design Patterns: Chain Of Responsibility**: [Link](https://blog.stackademic.com/behavioral-design-patterns-chain-of-responsibility-26d924b2df2b)
- 🎥 **YouTube Video – Chain of Responsibility Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Chain of Responsibility in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/behavioral/chainofresponsibility)

---

## 🧾 Command Pattern (Behavioral)

![command](https://github.com/user-attachments/assets/2650cf54-ae75-464e-8330-c8d7d16c1f09)


### 📖 Overview

The **Command** pattern encapsulates a request as an object, thereby allowing parameterization of clients with different requests, queuing of requests, and logging of operations. It decouples the object that invokes the operation from the one that knows how to perform it.

This pattern is useful for implementing undo/redo operations, transactional systems, and task queues.

### 🔧 Purpose

- Encapsulate a request as an object
- Decouple the sender and receiver of a request
- Allow queuing, logging, and undo/redo of operations
- Enable dynamic assignment of behavior at runtime

---

### 🛠️ When to Use Command

- When you need to parameterize objects with operations
- When requests need to be handled at different times or in different orders (e.g., queues)
- When implementing features like undo/redo, logging, or transactional behavior
- When multiple invokers can trigger the same actions in different ways

---

### 📚 Learn More

- 📄 **Medium Article – Behavioral Design Patterns: Command**: [Link](https://blog.stackademic.com/behavioral-design-patterns-command-b8168eb74bd7?source=user_profile_page---------0-------------6f7f0ea334b7----------------------)
- 🎥 **YouTube Video – Command Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Command in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/behavioral/command)

---

## 🔁 Iterator Pattern (Behavioral)

![iterator](https://github.com/user-attachments/assets/e1249e13-f69f-4886-9538-bb0924801be2)

### 📖 Overview

The **Iterator** pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. It promotes encapsulation and supports uniform traversal of different types of collections.

This pattern is fundamental in collection processing and is widely supported in the Java Collections Framework through the `Iterator` and `Iterable` interfaces.

### 🔧 Purpose

- Traverse complex data structures without exposing internal details
- Provide a standard interface for sequential access
- Support multiple traversals simultaneously or in different ways
- Promote separation of concerns between data structures and iteration logic

---

### 🛠️ When to Use Iterator

- When you need to iterate over a collection without exposing its internal structure
- When different traversal algorithms are required (e.g., forward, reverse, filtering)
- When supporting multiple concurrent or nested iterations
- When collections need to offer a uniform traversal interface

---

### 📚 Learn More

- 📄 **Medium Article – Behavioral Design Patterns: Iterator**: [Link](#)
- 🎥 **YouTube Video – Iterator Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Iterator in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/behavioral/iterator)

---

## 🧳 Memento Pattern (Behavioral)

![memento](https://github.com/user-attachments/assets/44c2593b-fd1e-4d05-b9e9-c02e587a6492)


### 📖 Overview

The **Memento** pattern captures and externalizes an object's internal state so that the object can be restored to that state later—without violating encapsulation. It is especially useful for implementing features like undo/redo, checkpoints, or history tracking.

The pattern involves three key roles: the **Originator** (the object whose state needs saving), the **Memento** (a snapshot of the state), and the **Caretaker** (which manages the memento).

### 🔧 Purpose

- Save and restore an object’s state without exposing internal details
- Enable undo/redo or rollback functionality
- Preserve encapsulation boundaries while providing recovery options
- Decouple state management from application logic

---

### 🛠️ When to Use Memento

- When implementing undo/redo or rollback features
- When an object's internal state changes over time and you want to restore previous states
- When you need to preserve object integrity while providing state snapshots
- When storing checkpoints or snapshots of system state during runtime

---

### 📚 Learn More

- 📄 **Medium Article – Behavioral Design Patterns: Memento**: [Link](#)
- 🎥 **YouTube Video – Memento Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Memento in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/behavioral/memento)

---

## 👀 Observer Pattern (Behavioral)

![observer](https://github.com/user-attachments/assets/f03af41f-732f-404c-93db-8f7011496c30)


### 📖 Overview

The **Observer** pattern defines a one-to-many dependency between objects so that when one object (the **Subject**) changes state, all its dependents (the **Observers**) are notified and updated automatically. This promotes loose coupling and dynamic event-driven communication between components.

It is widely used in UI frameworks, event handling systems, and reactive programming.

### 🔧 Purpose

- Establish a publish-subscribe relationship between objects
- Decouple subjects from their observers
- Allow dynamic registration and deregistration of observers
- Enable automatic and consistent state updates

---

### 🛠️ When to Use Observer

- When multiple objects need to be updated whenever another object changes
- When you want to avoid tight coupling between subject and observers
- When building event-driven or reactive systems
- When implementing notification services, data bindings, or messaging systems

---

### 📚 Learn More

- 📄 **Medium Article – Behavioral Design Patterns: Observer**: [Link](#)
- 🎥 **YouTube Video – Observer Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Observer in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/behavioral/observer)

---
## 🎭 State Pattern (Behavioral)

![state](https://github.com/user-attachments/assets/d07185bd-d990-410e-b359-51f362dbe3c6)


### 📖 Overview

The **State** pattern allows an object to change its behavior when its internal state changes, appearing to change its class. It encapsulates state-specific behavior into separate state classes and delegates state-dependent behavior to the current state.

This pattern promotes the **Single Responsibility** and **Open/Closed** principles by organizing behaviors around states rather than cluttering conditional logic.

### 🔧 Purpose

- Allow an object to alter its behavior when its internal state changes
- Eliminate large conditional statements (e.g., `if-else` or `switch`)
- Encapsulate state-specific behavior in dedicated classes
- Promote better cohesion and separation of concerns

---

### 🛠️ When to Use State

- When an object's behavior depends on its state, and it must change at runtime
- When using a lot of conditional logic to manage behavior transitions
- When you want to encapsulate and isolate state-specific logic
- When different states should be treated as first-class objects with their own behavior

---

### 📚 Learn More

- 📄 **Medium Article – Behavioral Design Patterns: State**: [Link](#)
- 🎥 **YouTube Video – State Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [State in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/behavioral/state)

---

## 🧠 Strategy Pattern (Behavioral)

![strategy](https://github.com/user-attachments/assets/fda531dc-4b05-40b0-9f65-0f5399846892)


### 📖 Overview

The **Strategy** pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from the clients that use it.

This pattern promotes flexibility and adherence to the **Open/Closed Principle**, making it easy to introduce new strategies without altering existing code.

### 🔧 Purpose

- Define a common interface for a set of interchangeable behaviors (algorithms)
- Enable the selection of behavior at runtime
- Eliminate conditional logic (e.g., `if-else`) for choosing an algorithm
- Promote composition over inheritance by injecting behavior

---

### 🛠️ When to Use Strategy

- When you have multiple algorithms or behaviors that can be swapped dynamically
- When different clients might require different variations of a behavior
- When you want to isolate the logic of an algorithm from the context in which it’s used
- When you're refactoring complex conditional statements into clean, modular code

---

### 📚 Learn More

- 📄 **Medium Article – 
Behavioral Design Patterns: Strategy**: [Link](#)
- 🎥 **YouTube Video – Strategy Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Strategy in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/behavioral/strategy)

---

## 🧬 Template Method Pattern (Behavioral)

![template method](https://github.com/user-attachments/assets/261439ff-7d4d-4c28-8074-97d091c7f270)


### 📖 Overview

The **Template Method** pattern defines the skeleton of an algorithm in a base class but lets subclasses override specific steps without changing the overall structure. This promotes code reuse and enforces a consistent workflow across different implementations.

It follows the **Hollywood Principle**: “Don’t call us, we’ll call you.”

### 🔧 Purpose

- Define the invariant parts of an algorithm once and let subclasses implement the variable parts
- Promote reuse of common behavior while allowing customization of specific steps
- Control the order and structure of operations across multiple implementations
- Avoid code duplication in closely related classes

---

### 🛠️ When to Use Template Method

- When multiple classes share the same algorithm structure but differ in specific steps
- When you want to enforce a particular sequence of operations
- When refactoring duplicated code across subclasses with similar workflows
- When using frameworks that define lifecycle hooks (common in UI or testing frameworks)

---

### 📚 Learn More

- 📄 **Medium Article – Behavioral Design Patterns: Template Method**: [Link](#)
- 🎥 **YouTube Video – Template Method Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Template Method in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/behavioral/templatemethod)

---

## 🧳 Visitor Pattern (Behavioral)

![visitor](https://github.com/user-attachments/assets/b5220a54-b696-45b9-9000-b10ea36f31b1)


### 📖 Overview

The **Visitor** pattern lets you define a new operation without changing the classes of the elements on which it operates. It separates algorithms from the objects on which they operate, enabling you to add new behaviors to object structures without modifying them.

This pattern is especially useful when working with composite object structures or class hierarchies.

### 🔧 Purpose

- Separate an algorithm from the object structure it operates on
- Add new operations without modifying existing object structures
- Follow the **Open/Closed Principle** for adding behavior
- Promote cleaner organization of complex behaviors across multiple types

---

### 🛠️ When to Use Visitor

- When you need to perform operations across a complex object structure (e.g., AST, DOM, or file system)
- When the object structure rarely changes but new behaviors are frequently added
- When behavior depends on both object type and context (i.e., double dispatch)
- When centralizing related operations across different types enhances maintainability

---

### 📚 Learn More

- 📄 **Medium Article – Behavioral Design Patterns: Visitor**: [Lnk](#)
- 🎥 **YouTube Video – Visitor Design Pattern Explained**: [Coming Soon](#)
- 📂 See the Java implementation: [Visitor in the repository](https://github.com/LuisSalas94/design_patterns/tree/main/src/main/java/org/fernando/behavioral/visitor)


