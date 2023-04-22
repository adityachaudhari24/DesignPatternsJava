package com.ecommercearchitect.proxypattern;

public class RealPaymentProcessor implements PaymentProcessor {
    public void processPayment(Order order) {
        // perform actual payment processing
        System.out.println("Processing payment for order: " + order.getId());
    }
}
