package com.singleton;

public class NonSyncSingleton {
    private static NonSyncSingleton instance;

    private NonSyncSingleton() {
        // private constructor prevents instantiation
    }

    public static NonSyncSingleton getInstance() {
        if (instance == null) {
            instance = new NonSyncSingleton();
        }
        return instance;
    }
}