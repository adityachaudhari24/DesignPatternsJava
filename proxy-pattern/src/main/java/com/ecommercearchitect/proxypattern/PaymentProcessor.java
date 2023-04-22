package com.ecommercearchitect.proxypattern;

import com.ecommercearchitect.proxypattern.exceptions.PaymentRequestsLimitExceededException;
import com.ecommercearchitect.proxypattern.exceptions.UnauthorizedAccessException;

public interface PaymentProcessor {
    public void processPayment(Order order) throws UnauthorizedAccessException, PaymentRequestsLimitExceededException;
}
