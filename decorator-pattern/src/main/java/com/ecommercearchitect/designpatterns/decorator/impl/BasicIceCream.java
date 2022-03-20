package com.ecommercearchitect.designpatterns.decorator.impl;

import com.ecommercearchitect.designpatterns.decorator.IceCream;

public class BasicIceCream extends IceCream {

    public BasicIceCream() {
        description = "IceCreme-Cone_With-basic-icecreme";
    }

    @Override
    public double cost() {
        return 0.60;
    }
}

