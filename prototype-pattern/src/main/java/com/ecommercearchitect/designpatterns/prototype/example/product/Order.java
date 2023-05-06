package com.ecommercearchitect.designpatterns.prototype.example.product;

public class Order {
    private TShirt tShirt;
    private int quantity;

    public Order(TShirt tShirt, int quantity) {
        this.tShirt = tShirt;
        this.quantity = quantity;
    }

    public TShirt getTShirt() throws CloneNotSupportedException {
        return tShirt.clone();
    }

    public int getQuantity() {
        return quantity;
    }

}
