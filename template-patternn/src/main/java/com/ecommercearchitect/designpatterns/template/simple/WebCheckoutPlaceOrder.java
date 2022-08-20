package com.ecommercearchitect.designpatterns.template.simple;

import org.springframework.stereotype.Component;

@Component
public class WebCheckoutPlaceOrder extends PlaceOrderTemplate {

    @Override
    public void setDeliveryAddress() {
        System.out.println("WebCheckoutPlaceOrder : setting customer's address provided by the customer during checkout as delivery address");
    }

    @Override
    public void takePayment() {
        System.out.println("WebCheckoutPickUpInStorePlaceOrder : taking payment from cart from webstore");
    }
}
