package com.ecommercearchitect.designpatterns.examples.strategy.using.methodargument;

import com.ecommercearchitect.designpatterns.examples.strategy.using.methodargument.strategies.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> productsInCart;

    public Cart() {
        this.productsInCart = new ArrayList<>();
    }

    public double calculateTotals(List<Product> productsInCart) {
        double totalItemsCost = productsInCart.stream().map(Product::getPrice).reduce(0.0d, (a, b) -> a + b);
        return totalItemsCost;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        double amuntToPay = calculateTotals(productsInCart);
        paymentStrategy.pay(amuntToPay);
    }

    public void addProduct(Product product) {
        this.productsInCart.add(product);
    }

    public void removeProduct(Product product) {
        this.productsInCart.remove(product);
    }
}
