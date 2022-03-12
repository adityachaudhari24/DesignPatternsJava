package com.ecommercearchitect.designpatterns.examples.strategy.using.methodargument.strategies;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;

    public CreditCardPaymentStrategy(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {

        System.out.println("Paid " + amount + " using credit card");
    }
}
