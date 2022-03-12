package com.ecommercearchitect.designpatterns.examples.strategy.using.methodargument;

import com.ecommercearchitect.designpatterns.examples.strategy.using.methodargument.strategies.CreditCardPaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyPatternUsingMethodArgumentTest {

    public static void main(String[] args) {

        Product product1 = new Product("Product1", 6.9, 0.3);
        Product product2 = new Product("Product2", 6.3, 0.2);
        Product product3 = new Product("Product3", 10.0, 0.6);
        Product product4 = new Product("Product4", 6.9, 0.8);
        Product product5 = new Product("Product5", 7.9, 0.2);

        Cart shoppingCart = new Cart();
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);
        shoppingCart.addProduct(product4);
        shoppingCart.addProduct(product5);

        //paymnte
        shoppingCart.pay(new CreditCardPaymentStrategy("Aditya","4545-4545-4545-4343"));
    }
}
