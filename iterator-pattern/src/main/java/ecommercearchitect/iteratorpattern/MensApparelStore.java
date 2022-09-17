package ecommercearchitect.iteratorpattern;

import java.util.ArrayList;

public class MensApparelStore {
    private ArrayList<Product> catalog;

    public MensApparelStore() {
        catalog = new ArrayList<>();

        //Add a few products to catalog
        addItem("Polo Mens T-Shirt Medium", "Polo Mens Shirt Medium size ", 16.99);
        addItem("Polo Mens T-Shirt Short", "Polo Mens Shirt Short size", 15.99);
        addItem("Polo Mens T-Shirt XL", "Polo Mens Shirt XL size", 19.99);
        addItem("Polo Mens T-Shirt XXL", "Polo Mens Shirt XXL size", 20.99);
        addItem("Louis Philippe slim-fit Shirt Medium", "Louis Philippe slim-fit Shirt Medium size ", 15.99);
        addItem("Louis Philippe slim-fit Shirt Short", "Louis Philippe slim-fit Shirt Short size", 14.99);
        addItem("Louis Philippe slim-fit Shirt XL", "Louis Philippe slim-fit Shirt XL size", 18.99);
        addItem("Louis Philippe slim-fitShirt XXL", "Louis Philippe slim-fit Shirt XXL size", 19.99);
    }

    public void addItem(String name, String description, double price) {
        Product product = new Product(name, description, price);
        catalog.add(product);
    }

    public ArrayList<Product> getCatalog() {
        return catalog;
    }

    public MensApparelStoreIterator createIterator() {
        return new MensApparelStoreIterator(catalog);
    }
}
