package com.ecommercearchitect.designpatterns.examples.observer.instockproduct.interfaces;

public interface ObserverCustomer {

    // update yourself, update an observer.
    void update(ObservableProduct observableProduct);

    //set InStock update (an update got from product)
    void setProductWatch(ObservableProduct product);
}
