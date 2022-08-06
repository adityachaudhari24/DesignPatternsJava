package com.ecommercearchitect.designpatterns.adaptor;

import com.ecommercearchitect.designpatterns.adaptor.businessobjects.Account;

public class AdvancedPaymentGatewayAdapter implements AdvancedPayGateway {

    private PaymentGateway paymentGateway;

    public AdvancedPaymentGatewayAdapter(PaymentGateway paymentGateway) {
        super();
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void makePayment(String mobile1, String mobile2) {
        System.out.println("makePayment is invoked from AdvancedPaymentGatewayAdapter");
        Account account1 = null;//get account number by mobile number mobile 1
        Account account2 = null;//get account number by mobile number mobile 2
        paymentGateway.doPayment(account1, account2);
    }

}

// code reference : https://www.packtpub.com/product/spring-5-design-patterns/9781788299459 from this ebook
