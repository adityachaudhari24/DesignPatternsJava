package com.ecommercearchitect.designpatterns.builder.ImmutableExample;

public class BuilderImmurableObjectExampleMain {
    public static void main(String[] args) {
        ImmutableObject immutableObject = new ImmutableObject.Builder(1, 2)
                .value3("Hello, world! I am immutable object")
                .build();

        System.out.println(immutableObject);
    }
}

// todo left here... its not complete
