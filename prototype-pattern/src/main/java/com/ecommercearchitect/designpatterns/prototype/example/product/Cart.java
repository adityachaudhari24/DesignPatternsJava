package com.ecommercearchitect.designpatterns.prototype.example.product;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<TShirt> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(TShirt item) {
        items.add(item);
    }

    public void removeItem(TShirt item) {
        items.remove(item);
    }

    public double getTotal() {
        double total = 0.0;
        for (TShirt item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printItems() {
        for (TShirt item : items) {
            System.out.println(item.getDesign() + " t-shirt, " + item.getSize() + ", " + item.getColor() + ": $" + item.getPrice());
        }
    }

    // other methods as needed

}
