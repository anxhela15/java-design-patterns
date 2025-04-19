package com.singleton;

public class DoubleCheckSyncSingleton {
    private static final Object object = new Object();
    private static DoubleCheckSyncSingleton instance = null;
 
    private DoubleCheckSyncSingleton() {}
 
    public static DoubleCheckSyncSingleton getInstance() {
        if (instance != null) {
            return instance;
        }
 
        synchronized (object) {
            if (instance == null) {
                instance = new DoubleCheckSyncSingleton();
            }
 
            return instance;
        }
    }
}
