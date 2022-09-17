package ecommercearchitect.iteratorpattern;

import java.util.Iterator;

public class WomensApparelStoreIterator implements Iterator {
    Product[] catalog;
    int position = 0;

    public WomensApparelStoreIterator(Product[] catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        if (position >= catalog.length || catalog[position] == null) {
            return false;

        } else {
            return true;
        }

    }

    @Override
    public Object next() {
        Product product = catalog[position];
        position = position + 1;

        return product;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("Can't remove item until you've done at least one next()");
        }
        if (catalog[position - 1] == null) {
            for (int i = position - 1; i < (catalog.length - 1); i++) {
                catalog[i] = catalog[i + 1];
            }
            catalog[catalog.length - 1] = null;
        }
    }
}
