package com.javadeveloperdiary.factorypattern.models;

public class JamaicanVeggieBurger extends Hamburger {

    public JamaicanVeggieBurger() {
        name = "Jamaican Style Veggie Burger";
        sauce = "Spicy jamaican sauce";
        buns = "Lettuce wrap!";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Jamaican style....");
    }
}
