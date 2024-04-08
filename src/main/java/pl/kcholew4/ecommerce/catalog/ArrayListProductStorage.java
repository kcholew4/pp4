package pl.kcholew4.ecommerce.catalog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProductStorage implements ProductStorage {

    public ArrayListProductStorage() {
        products = new ArrayList<>();
    }
    private ArrayList<Product> products;

    @Override
    public List<Product> allProducts() {
        return products;
    }

    @Override
    public void add(Product newProduct) {
        products.add(newProduct);
    }

    @Override
    public Product getProductBy(String id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst().get();
    }
}
