package com.ecommercearchitect.designpatterns.singleton.examples.eagarinstantiation;

public class EagerInstantiationSingleton {

    private static EagerInstantiationSingleton uniqueInstance = new EagerInstantiationSingleton();

    private EagerInstantiationSingleton() {
    }

    public static EagerInstantiationSingleton getInstance() {
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a eagerly instantiated Singleton! using static instance variable.";
    }
}
