package com.withoutfactory;

public class PizzaStore {

    public static void main(String[] args) {

        System.out.println("Order cheese pizza");
        orderPizza("cheese");

        System.out.println("Order cheese pizza");
        orderPizza("veggie");
    }
    public static Pizza orderPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
