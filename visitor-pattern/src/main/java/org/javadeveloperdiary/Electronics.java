package org.javadeveloperdiary;

class Electronics implements Product {
    private double price;
    private double weight;

    public Electronics(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
