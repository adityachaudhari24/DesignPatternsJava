package com.ecommercearchitect.designpatterns.prototype.example.simple;

public class Main {
    public static void main(String[] args) {
        // Create some sample products
        Product shirt = new Product("T-Shirt", "A comfortable cotton T-Shirt", 19.99, "https://example.com/t-shirt.jpg");
        Product hat = new Product("Baseball Hat", "A stylish baseball hat", 14.99, "https://example.com/baseball-hat.jpg");

        // Create a cart and add some products to it
        Cart cart = new Cart();
        try {
            cart.addItem(shirt);
            cart.addItem(hat);
            cart.addItem(shirt); // Add another T-Shirt to the cart
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Print the total cost of the items in the cart
        System.out.println("Total: $" + cart.getTotal());
    }
}
