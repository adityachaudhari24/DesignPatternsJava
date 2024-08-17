package org.javadeveloperdiary;

interface Product {
    void accept(Visitor visitor);

    double getPrice();

    double getWeight();
}
