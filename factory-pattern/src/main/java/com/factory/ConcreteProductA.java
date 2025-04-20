package com.factory;

public class ConcreteProductA implements Product {
    @Override
    public void execute() {
        System.out.println("Executing Product A");
    }
}