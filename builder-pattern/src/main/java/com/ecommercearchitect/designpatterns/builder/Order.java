package com.ecommercearchitect.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private Address shippingAddress;
    private PaymentMethod paymentMethod;
    private List<Item> items;

    private Double total = 0.0;

    private Order(OrderBuilder builder) {
        this.customer = builder.customer;
        this.shippingAddress = builder.shippingAddress;
        this.paymentMethod = builder.paymentMethod;
        this.items = builder.items;
    }

    public static class OrderBuilder {
        private Customer customer;
        private Address shippingAddress;
        private PaymentMethod paymentMethod;
        private List<Item> items = new ArrayList<>();

        public OrderBuilder(Customer customer, Address shippingAddress) {
            this.customer = customer;
            this.shippingAddress = shippingAddress;
        }

        public OrderBuilder paymentMethod(PaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public OrderBuilder addItem(Item item) {
            this.items.add(item);
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Double getTotal() {
        if (!this.getItems().isEmpty()) {
            this.total = this.getItems().stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum();
        } else {
            this.total = total;
        }
        return this.total;
    }

}
