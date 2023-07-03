package webshop;

public class WebShopApplication {
    public static void main(String[] args) {

        ProductCategory electronics = new ProductCategory("Electronics");
        Product tv1 = new Product("TV");
        Product phone1 = new Product("iPhone13");
        Product phone2 = new Product("iPhone14");
        ProductCategory phones = new ProductCategory("Phones");
        phones.addItem(phone1);
        phones.addItem(phone2);
        electronics.addItem(phones);
        electronics.addItem(tv1);
        electronics.print();
    }

}
