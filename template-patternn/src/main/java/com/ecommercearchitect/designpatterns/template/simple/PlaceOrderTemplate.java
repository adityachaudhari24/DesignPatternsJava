package com.ecommercearchitect.designpatterns.template.simple;

import org.springframework.stereotype.Component;

@Component
public abstract class PlaceOrderTemplate {

    public final void placeOrder() {
        doBasicCartValidations();
        setDeliveryAddress();
        takePayment();
        createOrderInERP();
    }

    public final void doBasicCartValidations() {
        System.out.println("Doing basic cart validations");
    }

    public final void createOrderInERP() {
        System.out.println("Creating order in ERP");
    }

    public abstract void setDeliveryAddress();

    public abstract void takePayment();

}
