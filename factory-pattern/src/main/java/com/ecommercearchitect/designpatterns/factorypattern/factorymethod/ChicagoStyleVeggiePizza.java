package com.ecommercearchitect.designpatterns.factorypattern.factorymethod;

public class ChicagoStyleVeggiePizza extends Pizza {

	public ChicagoStyleVeggiePizza() {
		this.name = "ChicagoStyleVeggiePizza";
	}

	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
