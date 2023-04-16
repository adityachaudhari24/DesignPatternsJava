package com.ecommercearchitect.state;

public class ShippedOrderState implements OrderState {
    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel a shipped order");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship an order that has already been shipped");
    }

    @Override
    public void deliver(Order order) {
        order.setState(new DeliveredOrderState());
        System.out.println("Order delivered");
    }
}
