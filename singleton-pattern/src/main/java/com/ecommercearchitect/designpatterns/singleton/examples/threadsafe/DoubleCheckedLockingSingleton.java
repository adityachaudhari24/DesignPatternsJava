package com.ecommercearchitect.designpatterns.singleton.examples.threadsafe;

public class DoubleCheckedLockingSingleton {

    private volatile static DoubleCheckedLockingSingleton uniqueInstance;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a double checked locking thread - safe Singleton!";
    }
}
