package com.ecommercearchitect.designpatterns.examples.strategy.validationstrategy;

import com.ecommercearchitect.designpatterns.examples.strategy.validationstrategy.validationstrategies.SpecialCharactersValidateCouponStrategy;
import com.ecommercearchitect.designpatterns.examples.strategy.validationstrategy.validationstrategies.UppercaseValidateCouponStrategy;
import com.ecommercearchitect.designpatterns.examples.strategy.validationstrategy.validationstrategies.ValidateCouponStrategy;
import com.ecommercearchitect.designpatterns.examples.strategy.validationstrategy.validationstrategies.NoWhiteSpaceValidateCouponStrategy;

import java.util.ArrayList;
import java.util.List;

public class ValidationStrategyPatternMain {

    public static void main(String[] args) {


        String couponCode1 = "AggA";
        String couponCode2 = "OFFER";

        List<ValidateCouponStrategy> couponStrategies = new ArrayList<>();
        couponStrategies.add(new SpecialCharactersValidateCouponStrategy());
        couponStrategies.add(new UppercaseValidateCouponStrategy());
        couponStrategies.add(new NoWhiteSpaceValidateCouponStrategy());

        // iterate over all validation rules for a coupon

        boolean isValidCoupon = couponStrategies.stream().allMatch(strategy -> strategy.validate(couponCode1));

        System.out.println("The coupon "+couponCode1+" is valid ? "+isValidCoupon);
    }
}
