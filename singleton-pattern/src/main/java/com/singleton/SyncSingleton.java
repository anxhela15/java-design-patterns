package com.singleton;

public class SyncSingleton {
    private static SyncSingleton instance;

    private SyncSingleton() {
        // private constructor prevents instantiation
    }

    public static synchronized SyncSingleton getInstance() {
        if (instance == null) {
            instance = new SyncSingleton();
        }
        return instance;
    }
}