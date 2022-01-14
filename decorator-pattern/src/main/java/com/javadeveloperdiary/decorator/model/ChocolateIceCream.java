package com.javadeveloperdiary.decorator.model;

import com.javadeveloperdiary.decorator.interfaces.IceCream;
import com.javadeveloperdiary.decorator.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {


    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Chocolate Ice-Cream!");
        return 1.0 + super.cost();

    }


}
