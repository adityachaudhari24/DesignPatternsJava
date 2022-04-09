package com.ecommercearchitect.designpatterns.factorypattern.simplefactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
