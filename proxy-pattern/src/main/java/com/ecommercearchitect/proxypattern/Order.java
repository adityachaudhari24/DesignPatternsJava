package com.ecommercearchitect.proxypattern;

public class Order {
    private String id;
    private double total;

    public Order(String id, double total) {
        this.id = id;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    // other getters and setters, if necessary
}
