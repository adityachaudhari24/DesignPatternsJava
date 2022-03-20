package com.ecommercearchitect.designpatterns.decorator;

import com.ecommercearchitect.designpatterns.decorator.impl.BasicIceCream;
import com.ecommercearchitect.designpatterns.decorator.impl.ChocolateAddon;
import com.ecommercearchitect.designpatterns.decorator.impl.MintAddon;
import com.ecommercearchitect.designpatterns.decorator.impl.NutsAddon;

public class DecoratorPatternMain {
    public static void main(String[] args) {
        IceCream basicIceCreme = new BasicIceCream();
        System.out.println(basicIceCreme.getDescription()+ " cost is $"+basicIceCreme.cost());

        // preparing icecreme with chocolate addon
        IceCream iceCreme2 = new BasicIceCream();
        iceCreme2 = new ChocolateAddon(iceCreme2);
        System.out.println(iceCreme2.getDescription()+ " $"+iceCreme2.cost());

        // preparing icecreme with chocolate addon and Mint  and Nuts addone
        IceCream iceCreme3 = new BasicIceCream();
        iceCreme3 = new ChocolateAddon(iceCreme3);
        iceCreme3 = new MintAddon(iceCreme3);
        iceCreme3 = new NutsAddon(iceCreme3);
        System.out.println(iceCreme3.getDescription()+ " $"+iceCreme3.cost());

    }
}
