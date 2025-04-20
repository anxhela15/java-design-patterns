package com.strategy;

/**
 * Concrete Strategy for addition.
 */
public class AddOperation implements OperationStrategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}