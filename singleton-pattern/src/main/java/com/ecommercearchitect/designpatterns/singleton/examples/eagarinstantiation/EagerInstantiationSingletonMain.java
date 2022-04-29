package com.ecommercearchitect.designpatterns.singleton.examples.eagarinstantiation;

public class EagerInstantiationSingletonMain {
    public static void main(String[] args) {
        EagerInstantiationSingleton singleton = EagerInstantiationSingleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
