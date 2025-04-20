package com.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StrategyPatternTest {

    @Test
    public void testAddOperation() {
        Context context = new Context(new AddOperation());
        assertEquals(15, context.executeStrategy(10, 5));
    }

    @Test
    public void testSubtractOperation() {
        Context context = new Context(new SubtractOperation());
        assertEquals(5, context.executeStrategy(10, 5));
    }

    @Test
    public void testSwitchStrategy() {
        Context context = new Context(new AddOperation());
        assertEquals(15, context.executeStrategy(10, 5));
        context.setStrategy(new SubtractOperation());
        assertEquals(5, context.executeStrategy(10, 5));
    }
}