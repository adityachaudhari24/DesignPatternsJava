package com.ecommercearchitect.designpatterns.decorator.impl;

import com.ecommercearchitect.designpatterns.decorator.IceCream;
import com.ecommercearchitect.designpatterns.decorator.IceCreamDecorator;

public class MintAddon extends IceCreamDecorator {
    IceCream iceCream;

    public MintAddon(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" + Mint-addon";
    }

    @Override public double cost() {
        return 1.50 + iceCream.cost();
    }
}
