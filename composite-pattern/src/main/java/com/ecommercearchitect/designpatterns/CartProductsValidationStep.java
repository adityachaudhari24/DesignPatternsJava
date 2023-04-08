package com.ecommercearchitect.designpatterns;

public class CartProductsValidationStep implements CheckoutStep {

    @Override
    public void perform() {
        // Implementation details for adding items to cart
        System.out.println("Performing some validationa on the products added to the cart");
    }
}
