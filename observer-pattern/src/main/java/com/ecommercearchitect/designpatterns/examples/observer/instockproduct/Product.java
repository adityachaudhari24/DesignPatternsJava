package com.ecommercearchitect.designpatterns.examples.observer.instockproduct;

import com.ecommercearchitect.designpatterns.examples.observer.instockproduct.interfaces.ObservableProduct;
import com.ecommercearchitect.designpatterns.examples.observer.instockproduct.interfaces.ObserverCustomer;

import java.util.ArrayList;
import java.util.List;

public class Product implements ObservableProduct {

    String name;
    double price;
    boolean inStock;
    List<ObserverCustomer> customersList;

    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.customersList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public boolean registerCustomer(ObserverCustomer customer) {
        if (null != customer && !customersList.contains(customer)) {
            customersList.add(customer);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeCustomer(ObserverCustomer customer) {

        if (null != customer && customersList.contains(customer)) {
            customersList.remove(customer);
            System.out.println(" removed customer from "+this.name+ "products inStock notification list");
            return true;
        }
        return false;
    }

    @Override
    public void notifyCustomersAboutProductInStock() {
        for(ObserverCustomer observer : customersList) {
            observer.update(this);
        }
    }

    @Override
    public boolean getUpdateAboutStock(ObserverCustomer observerCustomer) {
        return this.inStock;
    }

    @Override
    public String getProductDetails() {
        return this.name;
    }

    public void postUpdateAboutStock(boolean inStock) {
        this.inStock = inStock;
        if (this.inStock) {
            System.out.println("Stock is updated please notify respective customer");
            notifyCustomersAboutProductInStock();
        }
    }
}
