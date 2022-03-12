package com.javadeveloperdiary.factorypattern.models;

public class Hamburger {
    public String name;
    public String sauce;
    public String buns;

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Adding sauce..." + sauce);
        System.out.println("Adding buns ..." + buns);


    }
    public void cook(){
        System.out.println("Cooking...");
    }
    public void box(){
        System.out.println("Boxing...");
    }

    public String getName() {
        return name;
    }
}
