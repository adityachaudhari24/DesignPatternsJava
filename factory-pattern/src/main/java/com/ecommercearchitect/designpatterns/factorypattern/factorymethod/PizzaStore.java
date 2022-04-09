package com.ecommercearchitect.designpatterns.factorypattern.factorymethod;

public abstract class PizzaStore {

	String name;
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
