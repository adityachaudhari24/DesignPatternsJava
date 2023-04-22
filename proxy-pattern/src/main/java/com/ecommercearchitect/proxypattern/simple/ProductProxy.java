package com.ecommercearchitect.proxypattern.simple;

public class ProductProxy implements Product {
    private ConcreteProduct product;
    private Integer priceCache = null;

    public ProductProxy(ConcreteProduct product) {
        this.product = product;
    }

    public int getPrice() {
        if (this.priceCache == null) {
            System.out.println("calling different system to get price first time");
            this.priceCache = this.product.getPrice();
        }

        return this.priceCache;
    }
}
