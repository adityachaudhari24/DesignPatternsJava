package com.ecommercearchitect.designpatterns.examples.strategy.validationstrategy.validationstrategies;

public class UppercaseValidateCouponStrategy implements ValidateCouponStrategy {

    @Override
    public boolean validate(String couponCode) {
        return couponCode.equals(couponCode.toUpperCase());
    }
}
