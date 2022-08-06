package com.ecommercearchitect.designpatterns.adaptor;

import com.ecommercearchitect.designpatterns.adaptor.businessobjects.Account;

public class PaymentGatewayImpl implements PaymentGateway {
    @Override
    public void doPayment(Account account1, Account account2) {
        System.out.println("Do payment using Payment Gateway");
    }
}
