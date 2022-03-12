package com.javadeveloperdiary.factorypattern.interfaces;

import com.javadeveloperdiary.factorypattern.models.Hamburger;

public abstract class HamburgerStore {

    public Hamburger orderHamburger(String type) {
        Hamburger burger;

        //We now user our factory! Not the if statements.
        burger = createHamburger(type);  //factory.createHamburger(type);

        burger.prepare();
        burger.cook();
        burger.box();

        return burger;

    }

    abstract public Hamburger createHamburger(String type);
}
