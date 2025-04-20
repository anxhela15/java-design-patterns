package com.factory;

public class Main {
    public static void main(String[] args) {
        Product p1 = ProductFactory.createProduct(ProductFactory.ProductType.A);
        p1.execute();

        Product p2 = ProductFactory.createProduct(ProductFactory.ProductType.B);
        p2.execute();
    }
}