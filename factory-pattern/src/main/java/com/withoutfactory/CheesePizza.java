package com.withoutfactory;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("preparing cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("baking cheese pizza");

    }

    @Override
    public void cut() {
        System.out.println("currint cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("boxing cheese pizza");
    }
}
