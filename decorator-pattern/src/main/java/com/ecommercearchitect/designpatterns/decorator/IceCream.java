package com.ecommercearchitect.designpatterns.decorator;

public abstract class IceCream {

    public String description = "unknown description";

    public String getDescription() {
        return  description;
    }
    public abstract double cost();
}
