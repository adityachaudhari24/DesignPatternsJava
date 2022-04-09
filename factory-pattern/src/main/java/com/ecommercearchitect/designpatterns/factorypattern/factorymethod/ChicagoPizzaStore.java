package com.ecommercearchitect.designpatterns.factorypattern.factorymethod;

public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore() {
        this.name = "chicago style pizza";
    }

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else
            return null;
    }

    public String getName() {
        return this.name;
    }
}
