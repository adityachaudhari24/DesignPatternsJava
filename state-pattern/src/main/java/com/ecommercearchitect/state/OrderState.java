package com.ecommercearchitect.state;

public interface OrderState {
    void cancel(Order order);

    void ship(Order order);

    void deliver(Order order);
}
