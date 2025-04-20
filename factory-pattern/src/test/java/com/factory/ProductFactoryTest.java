package com.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductFactoryTest {

    @Test
    void testCreateProductA() {
        Product product = ProductFactory.createProduct(ProductFactory.ProductType.A);
        assertNotNull(product, "Factory should return a non-null Product for type A");
        assertTrue(product instanceof ConcreteProductA, "Expected ConcreteProductA");
    }

    @Test
    void testCreateProductB() {
        Product product = ProductFactory.createProduct(ProductFactory.ProductType.B);
        assertNotNull(product, "Factory should return a non-null Product for type B");
        assertTrue(product instanceof ConcreteProductB, "Expected ConcreteProductB");
    }

    @Test
    void testNullTypeThrowsNPE() {
        // Passing null to switch expression yields NullPointerException
        assertThrows(NullPointerException.class, () -> ProductFactory.createProduct(null));
    }
}