package com.ecommercearchitect.designpatterns.factorypattern.factorymethod;

public class ChicagoStyleClamPizza extends Pizza {

	public ChicagoStyleClamPizza() {
		this.name = "ChicagoStyleClamPizza";
	}


	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
