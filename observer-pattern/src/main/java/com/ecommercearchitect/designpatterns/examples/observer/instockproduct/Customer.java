package com.ecommercearchitect.designpatterns.examples.observer.instockproduct;

import com.ecommercearchitect.designpatterns.examples.observer.instockproduct.interfaces.ObservableProduct;
import com.ecommercearchitect.designpatterns.examples.observer.instockproduct.interfaces.ObserverCustomer;

public class Customer implements ObserverCustomer {

    double custID;
    String customerName;
    ObservableProduct observableProduct;

    public Customer(double custID, String customerName) {
        this.custID = custID;
        this.customerName = customerName;
    }

    @Override
    public void update(ObservableProduct observableProduct) {
        boolean productInStockUpdate = observableProduct.getUpdateAboutStock(this);

        if(productInStockUpdate == false) {
            System.out.println("Product stock has not been updated");
        } else {
            System.out.println("Hello "+this.customerName+" there is new stock available for the product : "+observableProduct.getProductDetails());
        }
    }

    @Override
    public void setProductWatch(ObservableProduct product) {
        this.observableProduct = product;
    }
}
