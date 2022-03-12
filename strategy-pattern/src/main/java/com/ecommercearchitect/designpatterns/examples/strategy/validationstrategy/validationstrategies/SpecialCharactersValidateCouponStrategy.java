package com.ecommercearchitect.designpatterns.examples.strategy.validationstrategy.validationstrategies;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharactersValidateCouponStrategy implements ValidateCouponStrategy {

    Pattern my_pattern = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);

    @Override
    public boolean validate(String couponCode) {
        Matcher my_match = my_pattern.matcher(couponCode);
        return !my_match.find();
    }
}
