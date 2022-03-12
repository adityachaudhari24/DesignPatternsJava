package com.ecommercearchitect.designpatterns.examples.strategy.using.instancevariable;

import com.ecommercearchitect.designpatterns.examples.strategy.using.instancevariable.strategies.ShippingChargesCalculationStrategy;

import java.util.List;

public class Cart {

    double totalPrice;
    //CalculationService calculationService = new CalculationService();

    ShippingChargesCalculationStrategy shippingChargesCalculationStrategy;

    // totalPrice is sum of totalItemsCost + shippingCharges
    public double calculateTotals(List<Product> productsInCart) {
        // total price is totalItemsCost + shippingCharges
        double totalItemsCost = productsInCart.stream().map(Product::getPrice).reduce(0.0d, (a, b) -> a + b);
        double cartWeight = productsInCart.stream().map(Product::getWeight).reduce(0.0d, (a, b) -> a + b);
        int totalItemsInCart = (int) productsInCart.stream().map(product -> product.getName()).count();

        double shippingCharges = shippingChargesCalculationStrategy.calculateShippingCharges(totalItemsInCart, cartWeight);

        totalPrice = totalItemsCost + shippingCharges;

        return totalPrice;
    }

    public void setShippingChargesCalculationStrategy(ShippingChargesCalculationStrategy shippingChargesCalculationStrategy) {
        this.shippingChargesCalculationStrategy = shippingChargesCalculationStrategy;
    }
}
