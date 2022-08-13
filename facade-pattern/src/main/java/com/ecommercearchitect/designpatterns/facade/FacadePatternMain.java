package com.ecommercearchitect.designpatterns.facade;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FacadePatternMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        CartFacade cartFacade = applicationContext.getBean(CartFacade.class);

        // adding product to cart facade is used to call related services in the respective business logic specific methods.
        cartFacade.addProductToCart();


        // TODO improve code to get other flows working in this code, as well as try to use entities (Product, Customer, Cart)
    }
}
