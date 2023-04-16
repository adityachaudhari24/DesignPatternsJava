package com.ecommercearchitect.state;

public class DeliveredOrderState implements OrderState {
    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel a delivered order");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship a delivered order");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver an order that has already been delivered");
    }

}
