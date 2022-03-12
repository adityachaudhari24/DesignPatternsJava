package com.ecommercearchitect.designpatterns.examples.strategy.using.instancevariable.strategies;

public interface ShippingChargesCalculationStrategy {

    double calculateShippingCharges(int totalItemsInCart, double cartWeight);
}
