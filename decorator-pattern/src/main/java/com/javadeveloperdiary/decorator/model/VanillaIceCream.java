package com.javadeveloperdiary.decorator.model;

import com.javadeveloperdiary.decorator.interfaces.IceCream;
import com.javadeveloperdiary.decorator.interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {

    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Vanilla Ice-Cream!");
        return 1.0 + super.cost();
    }
}
