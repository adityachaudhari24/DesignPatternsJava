package com.ecommercearchitect.proxypattern.simple;

public class ConcreteProduct implements Product {
    private String name;
    private int price;

    public ConcreteProduct(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
