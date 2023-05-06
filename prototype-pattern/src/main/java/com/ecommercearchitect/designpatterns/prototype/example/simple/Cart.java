package com.ecommercearchitect.designpatterns.prototype.example.simple;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) throws CloneNotSupportedException {
        items.add(product.clone());
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double getTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
