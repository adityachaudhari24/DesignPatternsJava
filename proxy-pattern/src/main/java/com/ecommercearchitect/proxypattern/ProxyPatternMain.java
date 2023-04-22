package com.ecommercearchitect.proxypattern;

import com.ecommercearchitect.proxypattern.exceptions.PaymentRequestsLimitExceededException;
import com.ecommercearchitect.proxypattern.exceptions.UnauthorizedAccessException;

public class ProxyPatternMain {
    public static void main(String[] args) {

        // create a new user context
        UserContext.setCurrentUser(new User("john.cena", "password"));
        // uncomment to make user authorized
        UserContext.getCurrentUser().setAuthorized(true);

        // create a new payment processor proxy
        PaymentProcessor processor = new PaymentProcessorProxy();

        // create a new order
        Order order = new Order("123456", 100.00);

        // process the payment
        try {
            processor.processPayment(order);
            /*processor.processPayment(order);
            processor.processPayment(order);
            processor.processPayment(order);
            processor.processPayment(order);
            processor.processPayment(order);
            processor.processPayment(order);
            processor.processPayment(order);*/

            System.out.println("Payment processed successfully.");
        } catch (PaymentRequestsLimitExceededException e) {
            System.out.println("Payment request limit exceeded: " + e.getMessage());
        } catch (UnauthorizedAccessException e) {
            System.out.println("Unauthorized access: " + e.getMessage());
        }
    }
}
