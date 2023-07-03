package webshop;

public class Product extends ProductCatalog{

    public Product(String name) {
        super(name);
    }

    @Override
    void print() {
        System.out.println("::: " + this.name);
    }
}
