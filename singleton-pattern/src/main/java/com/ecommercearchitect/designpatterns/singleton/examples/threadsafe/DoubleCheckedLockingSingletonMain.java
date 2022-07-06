package com.ecommercearchitect.designpatterns.singleton.examples.threadsafe;

public class DoubleCheckedLockingSingletonMain {
    public static void main(String[] args) {
        DoubleCheckedLockingSingleton singleton = DoubleCheckedLockingSingleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
