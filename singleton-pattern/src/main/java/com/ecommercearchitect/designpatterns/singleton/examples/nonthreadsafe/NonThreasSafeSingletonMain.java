package com.ecommercearchitect.designpatterns.singleton.examples.nonthreadsafe;

public class NonThreasSafeSingletonMain {
    public static void main(String[] args) {
        NonThreadSafeSingleton nonThreadSafeSingleton = NonThreadSafeSingleton.getInstance();
        System.out.println(nonThreadSafeSingleton.getDescription());
    }
}
