package com.ecommercearchitect.designpatterns.examples.strategy.using.instancevariable;

import com.ecommercearchitect.designpatterns.examples.strategy.using.instancevariable.strategies.CAShippingChargesCalculationStrategy;
import com.ecommercearchitect.designpatterns.examples.strategy.using.instancevariable.strategies.USShippingChargesCalculationStrategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyPatternUsingInstanceVariableTest {

    public static void main(String[] args) {

        Product product1 = new Product("Product1", 20.10, 0.3);
        Product product2 = new Product("Product2", 26.10,0.2);
        Product product3 = new Product("Product3", 67.10,0.5);
        Product product4 = new Product("Product4", 56.10,0.2);
        Product product5 = new Product("Product5", 56.10,0.2);
        Product product6 = new Product("Product6", 26.10,0.2);
        Product product7 = new Product("Product7", 59.10,0.2);
        Product product8 = new Product("Product8", 56.10,0.8);

        List<Product> productsInCart1 = new ArrayList<>();
        productsInCart1.add(product1);
        productsInCart1.add(product2);
        productsInCart1.add(product3);
        productsInCart1.add(product4);

        List<Product> productsInCart2 = new ArrayList<>();
        productsInCart2.add(product5);
        productsInCart2.add(product6);
        productsInCart2.add(product7);
        productsInCart2.add(product8);

        Cart cart1 = new Cart();
        cart1.setShippingChargesCalculationStrategy(new USShippingChargesCalculationStrategy());
        double cart1Total1 = cart1.calculateTotals(productsInCart1);
        System.out.println("US cart , cart1 total "+cart1Total1);


        Cart cart2 = new Cart();
        cart2.setShippingChargesCalculationStrategy(new CAShippingChargesCalculationStrategy());
        double cart1Total2 = cart2.calculateTotals(productsInCart2);
        System.out.println("Canada cart , cart2 total "+cart1Total2);


        /*
        * what we have achieved using strategy pattern here?
        * 1. calculateTotals does not have to know about country by parameter its now associated with Cart by setShippingChargesCalculationStrategy
        * 2. we no more need calculationService to hold shipping price calculations because cart has delegated it to respective strategy classes
        * 3. we have extract different behaviours in separate strategy classes
        * 4. We can add new strategies without having to change anything in Cart class code as we inject strategy via composition.
        * */
    }
}
