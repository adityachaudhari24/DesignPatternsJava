package ecommercearchitect.iteratorpattern;

public class WomensApparelStore {
    private static final int MAX_ITEMS = 4;
    private int numberOfProducts = 0;
    private Product[] catalog;

    public WomensApparelStore() {
        catalog = new Product[MAX_ITEMS];

        //Add a few products to catalog
        addItem("Beige & Black Animal Print Shirt Style Top MEDIUM", "Beige & Black Animal Print Shirt Style Top best buy medium ", 12.99);
        addItem("Beige & Black Animal Print Shirt Style Top Long", "Polo Womens Shirt Short size best buy long", 15.99);
        addItem("Women Black Geometric Print Puff Sleeves Top", "Women Black Geometric Print Puff Sleeves Top", 19.99);
        addItem("Women White & Yellow Floral Shirt Style Top", "Women White & Yellow Floral Shirt Style Top", 20.99);
    }

    public void addItem(String name, String description, double price) {
        Product product = new Product(name, description, price);

        if (numberOfProducts >= MAX_ITEMS) {
            System.out.println("Increase capacity Catalog size is Full");

        } else {
            catalog[numberOfProducts] = product;
            numberOfProducts = numberOfProducts + 1;
        }
    }

    public Product[] getCatalog() {
        return catalog;
    }

    public WomensApparelStoreIterator createIterator() {
        return new WomensApparelStoreIterator(catalog);
    }
}
