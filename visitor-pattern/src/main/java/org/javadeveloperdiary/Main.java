package org.javadeveloperdiary;

public class Main {
    public static void main(String[] args) {
        Product book = new Book(20, 2); // $20, 2 kg
        Product laptop = new Electronics(1000, 5); // $1000, 5 kg

        // Calculate shipping cost
        ShippingCostVisitor shippingVisitor = new ShippingCostVisitor();
        book.accept(shippingVisitor);
        System.out.println("Book Shipping Cost: $" + shippingVisitor.getShippingCost());

        laptop.accept(shippingVisitor);
        System.out.println("Laptop Shipping Cost: $" + shippingVisitor.getShippingCost());

        // Apply discount
        DiscountVisitor discountVisitor = new DiscountVisitor();
        book.accept(discountVisitor);
        System.out.println("Book Discount: $" + discountVisitor.getDiscount());

        laptop.accept(discountVisitor);
        System.out.println("Laptop Discount: $" + discountVisitor.getDiscount());
    }
}