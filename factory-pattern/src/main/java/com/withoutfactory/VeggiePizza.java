package com.withoutfactory;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("preparing veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("preparing veggie pizza");
    }

    @Override
    public void box() {
        System.out.println("preparing veggie pizza");
    }
}
