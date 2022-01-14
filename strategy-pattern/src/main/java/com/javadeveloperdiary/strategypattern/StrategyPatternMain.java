package com.javadeveloperdiary.strategypattern;

public class StrategyPatternMain {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("987", 15);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        //payment decisions
        cart.pay(new PaypalAlgorithm("acc24.aditya@gmail.com", "aditya"));

        cart.pay(new CreditCardAlgorithm("Aditya", "238756464"));

    }
}
