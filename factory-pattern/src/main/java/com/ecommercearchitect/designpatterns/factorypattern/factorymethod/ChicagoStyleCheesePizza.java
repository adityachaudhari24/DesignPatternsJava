package com.ecommercearchitect.designpatterns.factorypattern.factorymethod;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		this.name = "ChicagoStyleCheesePizza";
	}


	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
