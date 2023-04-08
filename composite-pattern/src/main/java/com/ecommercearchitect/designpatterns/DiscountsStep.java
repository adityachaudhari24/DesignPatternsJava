package com.ecommercearchitect.designpatterns;

public class DiscountsStep implements CheckoutStep {

    @Override
    public void perform() {
        // Implementation details for discounts on items to cart
        System.out.println("Performing promotions and discounts step");
    }
}
