package com.ecommercearchitect.proxypattern.exceptions;

public class PaymentRequestsLimitExceededException extends Exception {
    public PaymentRequestsLimitExceededException(String message) {
        super(message);
    }
}
