package com.ecommercearchitect.designpatterns.facade.services;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean isRegisteredCustomer() {
        System.out.println("checking if customer is registered customer");
        return Boolean.TRUE;  // returning true jus for example
    }

    public void createCustomer() {
        // creating customer business logic
        System.out.println("creating customer");
    }

    public void getCustomer() {
        // getting customer business logic
        System.out.println("getting  customer");
    }
}
