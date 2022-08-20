package com.ecommercearchitect.designpatterns.template.simple;

import org.springframework.stereotype.Component;

@Component
public class InStorePlaceOrder extends PlaceOrderTemplate{
    @Override
    public void setDeliveryAddress() {
        System.out.println("InStorePlaceOrder : setting store address as delivery address");
    }

    @Override
    public void takePayment() {
        System.out.println("InStorePlaceOrder : processing instore payment process");
    }
}
