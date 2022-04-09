package com.ecommercearchitect.designpatterns.factorypattern.simplefactory;

public class PizzaStore {

    private static SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

    public static void main(String[] args) {

        System.out.println("Order cheese pizza");
        orderPizza("cheese");

        System.out.println("Order cheese pizza");
        orderPizza("veggie");
    }

    public static Pizza orderPizza(String type) {
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
