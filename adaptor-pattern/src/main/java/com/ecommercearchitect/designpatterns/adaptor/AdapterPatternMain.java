package com.ecommercearchitect.designpatterns.adaptor;

public class AdapterPatternMain {
    public static void main(String[] args) {

        // our old payment gateway
        PaymentGateway paymentGateway = new PaymentGatewayImpl();

        //new payment gateway which is referring to the our Adaptor class
        AdvancedPayGateway advancedPayGateway = new AdvancedPaymentGatewayAdapter(paymentGateway);
        String mobile1 = null;
        String mobile2 = null;

        // invoking the adaptor's makePayment
        advancedPayGateway.makePayment(mobile1, mobile2);
    }
}

// code reference : https://www.packtpub.com/product/spring-5-design-patterns/9781788299459 from this ebook
