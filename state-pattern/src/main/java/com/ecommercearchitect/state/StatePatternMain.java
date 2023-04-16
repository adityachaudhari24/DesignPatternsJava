package com.ecommercearchitect.state;

public class StatePatternMain {
    public static void main(String[] args) {
        Order order1 = new Order();
        System.out.println("Example one - A shipped, delivered and already cancelled order cannot be cancel.");
        System.out.println("order1 current state is - " + order1.getState());
        order1.cancel();
        System.out.println("order1 current state is - " + order1.getState());
        order1.ship();
        order1.deliver();
        System.out.println("order1 current state is - " + order1.getState());

        Order order2 = new Order();
        System.out.println("\nExample two - Delivered order cannot be shipped");
        System.out.println("order2 current state is - " + order2.getState());
        order2.ship();
        order2.deliver();
        order2.ship();
        System.out.println("order2 current state is - " + order2.getState());

        Order order3 = new Order();
        System.out.println("\nExample three - New order only be cancelled before it gets shipped");
        System.out.println("order3 current state is - " + order3.getState());
        order3.cancel();
        System.out.println("order3 current state is - " + order3.getState());
    }
}
