package com.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context.setStrategy(new SubtractOperation());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }
}