package com.ecommercearchitect.designpatterns.prototype.example.product;

public class Main {
    public static void main(String[] args) {
        // Create a prototype t-shirt our base default variant
        TShirt prototype = new TShirt("red", "M", "logo", 24.99);

        // Create an order for 3 t-shirts
        //Order order = new Order(prototype, 3);

        // Get a clone of the prototype t-shirt
        try {

            TShirt tShirt = prototype.clone();
            // Customize the t-shirt
            tShirt.setColor("blue");
            tShirt.setSize("L");
            tShirt.setDesign("text");
            tShirt.setPrice(29.99);

            // Add the customized t-shirt to the cart
            Cart cart = new Cart();
            cart.addItem(tShirt);
            System.out.println("\nPrinting items in the cart ");
            cart.printItems();


            // cloning the product from the OLD order, modify it and then modified product to the cart
            // Create a prototype t-shirt our base default variant  which belongs to the old order
            TShirt oldOrderTSHIRT = new TShirt("black", "L", "Name", 26.99);

            // Create an order for 3 t-shirts
            Order order = new Order(oldOrderTSHIRT, 3);

            // in the getShirt , its providing the cloned object .
            TShirt tShirt2 = order.getTShirt();
            // Customize the t-shirt
            tShirt2.setColor("blue");
            tShirt2.setSize("L");
            tShirt2.setDesign("Name");
            tShirt2.setPrice(26.99);

            // adding Tshirt to the cart
            cart.addItem(tShirt2);
            System.out.println("\nPrinting items in the cart ");
            cart.printItems();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
