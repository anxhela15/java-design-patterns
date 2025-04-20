package com.strategy;

/**
 * Strategy interface declares an execution method common to all supported versions
 * of some algorithm.
 */
public interface OperationStrategy {
    int execute(int a, int b);
}