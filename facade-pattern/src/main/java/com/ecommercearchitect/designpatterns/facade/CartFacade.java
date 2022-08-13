package com.ecommercearchitect.designpatterns.facade;

import com.ecommercearchitect.designpatterns.facade.services.InventoryService;
import com.ecommercearchitect.designpatterns.facade.services.PaymentService;
import com.ecommercearchitect.designpatterns.facade.services.PlaceOrderServices;
import com.ecommercearchitect.designpatterns.facade.services.ShippingService;
import com.ecommercearchitect.designpatterns.facade.services.TaxService;
import com.ecommercearchitect.designpatterns.facade.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartFacade {

    @Autowired
    UserService userService;

    @Autowired
    TaxService taxService;

    @Autowired
    ShippingService shippingService;

    @Autowired
    PlaceOrderServices placeOrderServices;

    @Autowired
    PaymentService paymentService;

    @Autowired
    InventoryService inventoryService;


    public void addProductToCart() {
        //TODO using services and adding product to cart goes here
        getUserService().isRegisteredCustomer();
        getInventoryService().isProductAvailableInStock();

    }

    public void removeProductFromCart() {
        //TODO using services and removing product from cart
    }

    public void placeOrderForCart() {
        //TODO using services placing order for an cart
    }

    protected UserService getUserService() {
        return this.userService;
    }

    protected TaxService getTaxService() {
        return this.taxService;
    }

    protected ShippingService getShippingService() {
        return this.shippingService;
    }

    protected PlaceOrderServices getPlaceOrderServices() {
        return this.placeOrderServices;
    }

    protected PaymentService getPaymentService() {
        return this.paymentService;
    }

    public InventoryService getInventoryService() {
        return this.inventoryService;
    }
}
