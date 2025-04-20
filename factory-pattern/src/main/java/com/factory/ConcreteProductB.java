package com.factory;

public class ConcreteProductB implements Product {
    @Override
    public void execute() {
        System.out.println("Executing Product B");
    }
}