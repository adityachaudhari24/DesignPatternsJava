package ecommercearchitect.iteratorpattern;

import java.util.Iterator;

public class MensAndWomensApparelStore {

    public static void main(String[] args) {
        MensApparelStore mensApparelStore = new MensApparelStore();
        WomensApparelStore womensApparelStore = new WomensApparelStore();

        //printCatalogWithoutIterator(mensApparelStore, womensApparelStore);
        printCatalogWithIterator(mensApparelStore, womensApparelStore);

    }

    private static void printCatalogWithoutIterator(MensApparelStore mensApparelStore, WomensApparelStore womensApparelStore) {

        System.out.println("Printing mens Catalog: ");
        for(Product apparelProduct : mensApparelStore.getCatalog()) {
            System.out.print(apparelProduct.getName() + ", ");
            System.out.print(apparelProduct.getDescription() + " ");
            System.out.println(apparelProduct.getPrice());
        }

        System.out.println("\n Printing womens Catalog: ");
        for(Product apparelProduct : womensApparelStore.getCatalog()) {
            System.out.print(apparelProduct.getName() + ", ");
            System.out.print(apparelProduct.getDescription() + " ");
            System.out.println(apparelProduct.getPrice());
        }
    }

    private static void printCatalogWithIterator(MensApparelStore mensApparelStore, WomensApparelStore womensApparelStore) {
        Iterator mensApparelStoreIterator = mensApparelStore.createIterator();
        System.out.println("Printing mens Catalog: ");
        printCatalog(mensApparelStoreIterator);

        System.out.println("\nPrinting womens Catalog: ");
        Iterator womensApparelStoreIterator = womensApparelStore.createIterator();
        printCatalog(womensApparelStoreIterator);
    }

    private static void printCatalog(Iterator iterator) {
        while (iterator.hasNext()) {
            Product product = (Product)iterator.next();
            System.out.print(product.getName() + ", ");
            System.out.print(product.getDescription() + " ");
            System.out.println(product.getPrice());
        }
    }
}
