package com.ecommercearchitect.designpatterns.examples.strategy.using.instancevariable.strategies;

public class CAShippingChargesCalculationStrategy implements ShippingChargesCalculationStrategy{
    @Override
    public double calculateShippingCharges(int totalItemsInCart, double cartWeight) {
        System.out.println("Hello from CAShippingChargesCalculationStrategy");
        // for test returning static logic in reality it ll be some third party call
        return cartWeight * totalItemsInCart * 0.4;
    }
}
