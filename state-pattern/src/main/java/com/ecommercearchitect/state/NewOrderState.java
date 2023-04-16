package com.ecommercearchitect.state;

public class NewOrderState implements OrderState {
    @Override
    public void cancel(Order order) {
        order.setState(new CancelledOrderState());
        System.out.println("Order cancelled");
    }

    @Override
    public void ship(Order order) {
        order.setState(new ShippedOrderState());
        System.out.println("Order shipped");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver an order that has not been shipped");
    }
}
