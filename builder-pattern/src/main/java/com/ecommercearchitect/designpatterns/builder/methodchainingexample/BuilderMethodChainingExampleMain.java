package com.ecommercearchitect.designpatterns.builder.methodchainingexample;

public class BuilderMethodChainingExampleMain {
    public static void main(String[] args) {
        Car car = new Car.Builder().setModel("Honda Civic").setColor("Red").setYear(2021).build();
        System.out.println(car.getModel()); // output: Honda Civic
        System.out.println(car.getColor()); // output: Red
        System.out.println(car.getYear());  // output: 2021
    }
}
