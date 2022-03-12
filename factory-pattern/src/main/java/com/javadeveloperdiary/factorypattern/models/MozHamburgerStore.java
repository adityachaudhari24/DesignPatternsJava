package com.javadeveloperdiary.factorypattern.models;

import com.javadeveloperdiary.factorypattern.interfaces.HamburgerStore;

public class MozHamburgerStore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {

        if (type.equals("cheese")) {
            return new MozambicanCheeseBurger();
        }else if (type.equals("Veggie")) {
            return new MozambicanVeggieBurger();

        }else  return null;

    }
}
