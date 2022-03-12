package com.ecommercearchitect.designpatterns.examples.withoutstrategy;

import java.util.List;

public class Cart {

    double totalPrice;
    CalculationService calculationService = new CalculationService();

    // totalPrice is sum of totalItemsCost + shippingCharges
    public double calculateTotals(List<Product> productsInCart, String country) {
        // total price is totalItemsCost + shippingCharges
        double totalItemsCost = productsInCart.stream().map(Product::getPrice).reduce(0.0d, (a, b) -> a + b);
        double cartWeight = productsInCart.stream().map(Product::getWeight).reduce(0.0d, (a, b) -> a + b);
        int totalItemsInCart = (int) productsInCart.stream().map(product -> product.getName()).count();

        double shippingCharges = calculationService.calculateShippingCharges(country, totalItemsInCart, cartWeight);

        totalPrice = totalItemsCost + shippingCharges;

        return totalPrice;
    }
}
