package com.javadeveloperdiary.decorator.model;

import com.javadeveloperdiary.decorator.interfaces.IceCream;
import com.javadeveloperdiary.decorator.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override public double cost() {
        System.out.println("Adding Mint Ice-Cream!");
        return 1.50 + super.cost();
    }
}
