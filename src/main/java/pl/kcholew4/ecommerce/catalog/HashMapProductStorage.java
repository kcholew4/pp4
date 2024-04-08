package pl.kcholew4.ecommerce.catalog;

import java.util.HashMap;
import java.util.List;

public class HashMapProductStorage implements ProductStorage {
    private final HashMap<Object, Object> products;

    public HashMapProductStorage() {
        products = new HashMap<>();
    }

    @Override
    public List<Product> allProducts() {
        return null;
    }

    @Override
    public void add(Product newProduct) {
        products.put(newProduct.getId(), newProduct);
    }

    @Override
    public Product getProductBy(String id) {
        return null;
    }
}
