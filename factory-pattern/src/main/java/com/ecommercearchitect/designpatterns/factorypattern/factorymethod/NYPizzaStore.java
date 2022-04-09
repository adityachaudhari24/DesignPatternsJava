package com.ecommercearchitect.designpatterns.factorypattern.factorymethod;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore() {
        super.name = "Ny style pizza";
    }

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else
            return null;
    }

    public String getName() {
        return this.name;
    }
}
