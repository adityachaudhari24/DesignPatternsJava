package com.ecommercearchitect.designpatterns.template.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleTemplateMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        System.out.println("#### Customer performing placeOrder from Regular Web Checkout#### ");
        PlaceOrderTemplate webCheckoutPlaceOrder = applicationContext.getBean(WebCheckoutPlaceOrder.class);
        webCheckoutPlaceOrder.placeOrder();

        System.out.println("\n#### Customer performing placeOrder from Web Checkout by selecting PickUp in store ####");
        PlaceOrderTemplate webCheckoutPickUpInStorePlaceOrder = applicationContext.getBean(WebCheckoutPickUpInStorePlaceOrder.class);
        webCheckoutPickUpInStorePlaceOrder.placeOrder();

        System.out.println("\n#### Customer performing placeOrder from Instore ####");
        PlaceOrderTemplate inStorePlaceOrder = applicationContext.getBean(InStorePlaceOrder.class);
        inStorePlaceOrder.placeOrder();
    }

}
