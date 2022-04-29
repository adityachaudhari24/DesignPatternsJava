package com.ecommercearchitect.designpatterns.singleton.examples.nonthreadsafe;

public class NonThreadSafeSingleton {
    private static NonThreadSafeSingleton uniqueInstance;

    private NonThreadSafeSingleton() {
    }

    public static NonThreadSafeSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new NonThreadSafeSingleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a classic non thread- safe Singleton!";
    }
}

// This NonThreadSafeSingleton is fine when you are not concern about thread-safe , but most of the java applications basic threading must be considered.
// next example we ll see how we can improve this.
