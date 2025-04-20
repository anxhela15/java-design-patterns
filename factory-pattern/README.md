# Factory Design Pattern in Java

## Overview
The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. This approach promotes loose coupling and enhances code maintainability.

## Factory Pattern Explained

In this implementation:

- **Product Interface**: A sealed interface defining the contract for products.
- **Concrete Products**: Final classes (`ConcreteProductA`, `ConcreteProductB`) implementing the `Product` interface.
- **ProductFactory**: Contains a static method `createProduct` that returns instances of `Product` based on the provided `ProductType`.

This design allows for easy addition of new product types without modifying existing client code, adhering to the Open/Closed Principle.

