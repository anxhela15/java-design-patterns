package com.strategy;

/**
 * Concrete Strategy for subtraction.
 */
public class SubtractOperation implements OperationStrategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}