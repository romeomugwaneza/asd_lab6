package webshop;

import java.util.ArrayList;
import java.util.Collection;

public class ProductCategory extends ProductCatalog{
    protected Collection<ProductCatalog> catalogs = new ArrayList<ProductCatalog>();
    public ProductCategory(String name) {
        super(name);
    }
    public void addItem(ProductCatalog item){
        catalogs.add(item);
    }

    @Override
    void print() {
        System.out.println(": " + this.name);
        for (var item : catalogs)
            item.print();;
    }
    public Collection<ProductCatalog> getItems(){
        return this.catalogs;
    }
}
