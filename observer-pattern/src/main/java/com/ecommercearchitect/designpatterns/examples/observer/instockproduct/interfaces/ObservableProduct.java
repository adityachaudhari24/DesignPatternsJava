package com.ecommercearchitect.designpatterns.examples.observer.instockproduct.interfaces;

public interface ObservableProduct {

    // register a customer to Observable
    boolean registerCustomer(ObserverCustomer customer);

    // remove customer from Observable
    boolean removeCustomer(ObserverCustomer customer);

    // notify all customers about
    void notifyCustomersAboutProductInStock();

    // get update for specific observer
    boolean getUpdateAboutStock(ObserverCustomer observerCustomer);

    // get product details
    String getProductDetails();
}
