package com.javadeveloperdiary.factorypattern;

import com.javadeveloperdiary.factorypattern.interfaces.HamburgerStore;
import com.javadeveloperdiary.factorypattern.models.Hamburger;
import com.javadeveloperdiary.factorypattern.models.JamHamburgerstore;
import com.javadeveloperdiary.factorypattern.models.MozHamburgerStore;

public class FactoryPatternMain {

    public static void main(String[] args) {
        //CheeseBurger cheeseBurger = new CheeseBurger();

        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerstore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " + hamburger.getName() + "\n" );


        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("James Bond ordered: " + hamburger.getName() + "\n");
    }
}
