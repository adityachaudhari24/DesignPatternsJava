package com.ecommercearchitect.designpatterns.facade.services;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    public boolean isProductAvailableInStock() {
        // inventory check
        System.out.println("Is product available in stock check");
        return Boolean.TRUE; // sending static response just for reference.
    }

    // other methods related to inventory goes here
}
