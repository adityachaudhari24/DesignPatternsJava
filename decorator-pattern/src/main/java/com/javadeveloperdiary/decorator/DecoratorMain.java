package com.javadeveloperdiary.decorator;

import com.javadeveloperdiary.decorator.interfaces.IceCream;
import com.javadeveloperdiary.decorator.model.BasicIceCream;
import com.javadeveloperdiary.decorator.model.MintIceCream;
import com.javadeveloperdiary.decorator.model.VanillaIceCream;

public class DecoratorMain {
    public static void main(String[] args) {
        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost $" + basicIceCream.cost());

        //Add Vanilla to the order

        IceCream vanilla = new VanillaIceCream(basicIceCream); // wrapping vanilla
        System.out.println("Adding Vanilla - cost is: $" + vanilla.cost());


        //Add Mint to the order
        IceCream mint = new MintIceCream(vanilla);
        System.out.println("Adding Mint - cost is: $" + mint.cost());
    }

}
