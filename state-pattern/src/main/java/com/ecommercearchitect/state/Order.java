package com.ecommercearchitect.state;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void cancel() {
        state.cancel(this);
    }

    public void ship() {
        state.ship(this);
    }

    public void deliver() {
        state.deliver(this);
    }

    public OrderState getState() {
        return state;
    }
}
