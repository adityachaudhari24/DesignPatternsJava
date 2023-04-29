package com.ecommercearchitect.designpatterns.builder.methodchainingexample;

public class Car {
    private String model;
    private String color;
    private int year;

    public static class Builder {
        private String model;
        private String color;
        private int year;

        public Builder() {}

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.year = builder.year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
