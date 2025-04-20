package com.factory;

public class ProductFactory {
    public enum ProductType { A, B }

    public static Product createProduct(ProductType type) {
        return switch (type) {
            case A -> new ConcreteProductA();
            case B -> new ConcreteProductB();
        };
    }
}