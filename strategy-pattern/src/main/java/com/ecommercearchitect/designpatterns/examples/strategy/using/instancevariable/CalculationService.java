package com.ecommercearchitect.designpatterns.examples.strategy.using.instancevariable;

// we do not need this as we mave migrated this logic in separate strategy classes
public class CalculationService {
    public double calculateShippingCharges(String country, int totalItemsInCart, double cartWeight) {
        if (country.equals("US")) {
            // for test returning static logic in reality it ll be some third party call
            return cartWeight * totalItemsInCart * 0.50;
        }

        if (country.equals("CA")) {
            // for test returning static logic in reality it ll be some third party call
            return cartWeight * totalItemsInCart * 0.4;
        }

        if (country.equals("UK")) {
            // for test returning static logic in reality it ll be some third party call
            return cartWeight * totalItemsInCart * 0.7;
        }

        return 0.0d;
    }

}
