package com.ecommercearchitect.designpatterns.builder;

public class BuilderPatternMain {
    public static void main(String[] args) {

        // Create a new customer
        Customer customer = new Customer("Kiran Smith", "kiran.smith@example.com", "123-456-7890");

        // Create a shipping address
        Address shippingAddress = new Address("123 Main St", "Anytown", "CA", "12345");

        // Create an OrderBuilder and set the required attributes
        Order.OrderBuilder orderBuilder = new Order.OrderBuilder(customer, shippingAddress);

        // Add some items to the order
        Item item1 = new Item("Product 1", 10.0, 2);
        Item item2 = new Item("Product 2", 15.0, 1);
        orderBuilder.addItem(item1);
        orderBuilder.addItem(item2);

        // Set the payment method for the order
        PaymentMethod paymentMethod = new PaymentMethod("Visa", "1234567890123456", "12/24", "123");
        orderBuilder.paymentMethod(paymentMethod);

        // Build the order
        Order order = orderBuilder.build();

        // Display the order details
        System.out.println("Order details:");
        System.out.println("Customer name: " + order.getCustomer().getName());
        System.out.println("Shipping address: " + order.getShippingAddress().getStreetAddress());
        System.out.println("Payment method: " + order.getPaymentMethod().getName());

        System.out.println("Items:");
        for (Item item : order.getItems()) {
            System.out.println("- " + item.getName() + " x " + item.getQuantity() + " @ $" + item.getPrice());
        }

        System.out.println("Total: $" + order.getTotal());
    }
}
