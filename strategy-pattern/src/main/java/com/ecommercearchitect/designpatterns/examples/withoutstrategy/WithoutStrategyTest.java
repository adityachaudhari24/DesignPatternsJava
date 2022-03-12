package com.ecommercearchitect.designpatterns.examples.withoutstrategy;

import java.util.ArrayList;
import java.util.List;

public class WithoutStrategyTest {

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
        double cart1Total1 = cart1.calculateTotals(productsInCart1, "US");
        System.out.println("US cart , cart1 total "+cart1Total1);


        Cart cart2 = new Cart();
        double cart1Total2 = cart2.calculateTotals(productsInCart2, "CA");
        System.out.println("Canada cart , cart2 total "+cart1Total2);


        /*
        * what is problem with the code ? what improvement we can do?
        * 1. calculateShippingCharges method in CalculationService will become huge additional countries .
        * 2. shipping cost calculation price can be isolated in different classes .
        *
        * */
    }
}
