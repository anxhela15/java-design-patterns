package com.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    public void testNonSyncSingletonSameInstance() {
        NonSyncSingleton s1 = NonSyncSingleton.getInstance();
        NonSyncSingleton s2 = NonSyncSingleton.getInstance();
        assertSame(s1, s2, "NonSyncSingleton instances should be the same");
    }

    @Test
    public void testSyncSingletonSameInstance() {
        SyncSingleton s1 = SyncSingleton.getInstance();
        SyncSingleton s2 = SyncSingleton.getInstance();
        assertSame(s1, s2, "SyncSingleton instances should be the same");
    }

    @Test
    public void testDoubleCheckSingletonSameInstance() {
        DoubleCheckSyncSingleton d1 = DoubleCheckSyncSingleton.getInstance();
        DoubleCheckSyncSingleton d2 = DoubleCheckSyncSingleton.getInstance();
        assertSame(d1, d2, "DoubleCheckSyncSingleton instances should be the same");
    }

    @Test
    public void testSyncSingletonThreadSafety() throws InterruptedException {
        final SyncSingleton[] instances = new SyncSingleton[2];
        Thread t1 = new Thread(() -> instances[0] = SyncSingleton.getInstance());
        Thread t2 = new Thread(() -> instances[1] = SyncSingleton.getInstance());
        t1.start(); t2.start();
        t1.join(); t2.join();
        assertSame(instances[0], instances[1], "SyncSingleton should be thread-safe");
    }

    @Test
    public void testDoubleCheckSingletonThreadSafety() throws InterruptedException {
        final DoubleCheckSyncSingleton[] instances = new DoubleCheckSyncSingleton[2];
        Thread t1 = new Thread(() -> instances[0] = DoubleCheckSyncSingleton.getInstance());
        Thread t2 = new Thread(() -> instances[1] = DoubleCheckSyncSingleton.getInstance());
        t1.start(); t2.start();
        t1.join(); t2.join();
        assertSame(instances[0], instances[1], "DoubleCheckSyncSingleton should be thread-safe");
    }
}