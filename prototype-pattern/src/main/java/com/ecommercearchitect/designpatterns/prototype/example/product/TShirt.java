package com.ecommercearchitect.designpatterns.prototype.example.product;

public class TShirt implements Cloneable {
    private String color;
    private String size;
    private String design;
    private double price;

    public TShirt(String color, String size, String design, double price) {
        this.color = color;
        this.size = size;
        this.design = design;
        this.price = price;
    }

    public TShirt clone() throws CloneNotSupportedException {
        return (TShirt) super.clone();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
