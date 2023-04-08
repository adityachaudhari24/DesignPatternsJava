package com.ecommercearchitect.designpatterns;

public class CompositePatternMain {
    public static void main(String[] args) {
        CheckoutCompositeStep checkoutProcess = new CheckoutCompositeStep();
        checkoutProcess.addStep(new CartProductsValidationStep());
        checkoutProcess.addStep(new DiscountsStep());
        checkoutProcess.addStep(new ShippingAddressStep());
        checkoutProcess.addStep(new BillingAddressStep());
        checkoutProcess.addStep(new PaymentStep());
        checkoutProcess.addStep(new PlaceOrderStep());

        System.out.println("Executing checkout steps");
        checkoutProcess.perform();
    }
}
