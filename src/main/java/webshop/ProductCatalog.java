package webshop;

public abstract class ProductCatalog {
    String name;

    public ProductCatalog(String name) {
        this.name = name;
    }

    abstract void print();
}
