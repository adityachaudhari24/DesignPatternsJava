package com.ecommercearchitect.designpatterns.factorypattern.factorymethod;

public class ChicagoStylePepperoniPizza extends Pizza {

	public ChicagoStylePepperoniPizza() {
		this.name = "ChicagoStylePepperoniPizza";
	}


	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
