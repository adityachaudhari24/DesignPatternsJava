package com.ecommercearchitect.designpatterns.decorator.impl;

import com.ecommercearchitect.designpatterns.decorator.IceCream;
import com.ecommercearchitect.designpatterns.decorator.IceCreamDecorator;

public class NutsAddon extends IceCreamDecorator {

    IceCream iceCream;

    public NutsAddon(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Nuts addon";
    }

    @Override
    public double cost() {
        return 1.0 + iceCream.cost();
    }
}
