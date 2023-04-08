package com.ecommercearchitect.designpatterns;

public class PaymentStep implements CheckoutStep {

    @Override
    public void perform() {
        // Implementation details for payment step
        System.out.println("Performing payment step");
    }
}
