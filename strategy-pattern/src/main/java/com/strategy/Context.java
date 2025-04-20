package com.strategy;

/**
 * Context defines the interface of interest to clients.
 * It maintains a reference to a Strategy object and delegates execution.
 */
public class Context {
    private OperationStrategy strategy;

    public Context(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}