package com.ecommercearchitect.designpatterns.examples.strategy.validationstrategy.validationstrategies;

public interface ValidateCouponStrategy {

    boolean validate(String couponCode);
}
