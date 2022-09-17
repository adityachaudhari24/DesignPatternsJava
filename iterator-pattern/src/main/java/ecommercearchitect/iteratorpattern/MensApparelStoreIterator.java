package ecommercearchitect.iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class MensApparelStoreIterator implements Iterator {

    ArrayList<Product> catalog;
    int position = 0;

    public MensApparelStoreIterator(ArrayList<Product> catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        if (position >= catalog.size() || catalog.get(position) == null) {
            return false;

        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Product product = catalog.get(position);
        position = position + 1;

        return product;
    }

}
