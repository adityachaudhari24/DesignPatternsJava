package com.ecommercearchitect.proxypattern;

import com.ecommercearchitect.proxypattern.exceptions.PaymentRequestsLimitExceededException;
import com.ecommercearchitect.proxypattern.exceptions.UnauthorizedAccessException;

public class PaymentProcessorProxy implements PaymentProcessor {
    private PaymentProcessor realProcessor;
    public static final int MAX_PAYMENT_REQUESTS = 5;

    public PaymentProcessorProxy() {
        this.realProcessor = new RealPaymentProcessor();
    }

    public void processPayment(Order order) throws UnauthorizedAccessException, PaymentRequestsLimitExceededException {
        // check if user is authorized to process payments
        if (!UserContext.getCurrentUser().isAuthorized()) {
            throw new UnauthorizedAccessException("User is not authorized to process payments.");
        }

        // check if user has exceeded maximum number of payment processing requests
        if (UserContext.getCurrentUser().getPaymentRequestsCount() >= MAX_PAYMENT_REQUESTS) {
            throw new PaymentRequestsLimitExceededException("User has exceeded the maximum number of payment requests.");
        }

        // delegate actual payment processing to real processor
        this.realProcessor.processPayment(order);

        // update user's payment requests count
        UserContext.getCurrentUser().incrementPaymentRequestsCount();
    }
}
