package com.ecommercearchitect.designpatterns;

public class ShippingAddressStep implements CheckoutStep {

    @Override
    public void perform() {
        // Implementation details for shipping address step
        System.out.println("Performing shipping address step");
    }
}
