package com.ecommercearchitect.proxypattern.simple;

public class ProxyPatternSimpleMain {
    public static void main(String[] args) {

        ProductProxy productProxy1 = new ProductProxy(new ConcreteProduct("iPhone", 1000));

        // First call gets price from the Product object and caches it
        System.out.println(productProxy1.getPrice());

        // Second call returns the cached price
        System.out.println(productProxy1.getPrice());
    }
}
