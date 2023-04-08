package com.ecommercearchitect.designpatterns;

public class PlaceOrderStep implements CheckoutStep {

    @Override
    public void perform() {
        // Implementation details for place order
        System.out.println("PlaceOrder step");
    }
}
