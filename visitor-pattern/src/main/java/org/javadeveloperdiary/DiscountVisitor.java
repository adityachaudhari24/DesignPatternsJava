package org.javadeveloperdiary;

class DiscountVisitor implements Visitor {
    private double discount;

    @Override
    public void visit(Book book) {
        discount = book.getPrice() * 0.1; // Example: 10% discount
    }

    @Override
    public void visit(Electronics electronics) {
        discount = electronics.getPrice() * 0.2; // Example: 20% discount
    }

    public double getDiscount() {
        return discount;
    }
}
