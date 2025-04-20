package com.singleton;

public class DoubleCheckSyncSingleton {
    private static volatile DoubleCheckSyncSingleton instance;
    private static final Object lock = new Object();
    private DoubleCheckSyncSingleton() {}
 
    public static DoubleCheckSyncSingleton getInstance() {

        if(instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new DoubleCheckSyncSingleton();
                }
     
                return instance;
            } 
        }
        return instance;

    }
}
