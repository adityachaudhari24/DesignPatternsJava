package com.ecommercearchitect.designpatterns.adaptor;

import com.ecommercearchitect.designpatterns.adaptor.businessobjects.Account;

public interface PaymentGateway {
    void doPayment(Account account1, Account account2);
}
