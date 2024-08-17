package org.javadeveloperdiary;

class ShippingCostVisitor implements Visitor {
    private double shippingCost;

    @Override
    public void visit(Book book) {
        shippingCost = book.getWeight() * 0.5; // Example: $0.5 per unit weight
    }

    @Override
    public void visit(Electronics electronics) {
        shippingCost = electronics.getWeight() * 1.5; // Example: $1.5 per unit weight
    }

    public double getShippingCost() {
        return shippingCost;
    }
}


