package com.ecommercearchitect.designpatterns.examples.observer.instockproduct;

public class NotifyMeStockUpdateMain {

    public static void main(String[] args) {

        // create some products
        Product product1 = new Product("Product1",34,true);
        Product product2 = new Product("Product2",23,false);
        Product product3 = new Product("Product3", 12,false);
        Product product4 = new Product("product4", 12,false);
        Product product5 = new Product("product5", 18,false);

        // create some customers
        Customer customer1 = new Customer(123,"cusotmer1");
        Customer customer2 = new Customer(124,"cusotmer2");
        Customer customer3 = new Customer(125,"cusotmer3");
        Customer customer4 = new Customer(126,"cusotmer4");
        Customer customer5 = new Customer(127,"cusotmer5");

        // register customers for the product2
        product2.registerCustomer(customer1);
        product2.registerCustomer(customer2);
        product2.registerCustomer(customer3);

        // external service calls postUpdateAboutStock method to update stock for the product2.
        product2.postUpdateAboutStock(true);

        // removing customer 2 from product2 inStock update list
        product2.removeCustomer(customer2);

        // external service calls postUpdateAboutStock method to update stock for the product2.
        // notice customer 2 is not posted with the product 2 inStock update
        product2.postUpdateAboutStock(true);

        // Customer 5 wish to check inStock for product 5 by himself
        customer5.setProductWatch(product5);
        boolean isInStock = customer5.observableProduct.getUpdateAboutStock(customer5);
        System.out.println("Customer 5 checks for product5 instock and product in stock is "+isInStock);


    }
}
