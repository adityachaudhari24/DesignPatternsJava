package com.ecommercearchitect.state;

public class CancelledOrderState implements OrderState {
    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel a cancelled order");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Cannot ship a cancelled order");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Cannot deliver a cancelled order");
    }
}
