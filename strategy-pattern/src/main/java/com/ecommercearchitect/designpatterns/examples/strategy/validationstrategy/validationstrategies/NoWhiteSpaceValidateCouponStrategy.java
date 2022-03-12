package com.ecommercearchitect.designpatterns.examples.strategy.validationstrategy.validationstrategies;

import org.springframework.util.StringUtils;

public class NoWhiteSpaceValidateCouponStrategy implements ValidateCouponStrategy{
    @Override
    public boolean validate(String couponCode) {
        return !StringUtils.containsWhitespace(couponCode);
    }
}
