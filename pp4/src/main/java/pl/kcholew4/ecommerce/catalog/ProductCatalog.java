package pl.kcholew4.ecommerce.catalog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductCatalog {


    private ArrayList<Product> products;

    public ProductCatalog() {
        products = new ArrayList<>();
    }

    public List<Product> allProducts() {
        return products;
    }

    public String addProduct(String name, String description) {
        UUID id = UUID.randomUUID();
        Product newProduct = new Product(id, name, description);

        products.add(newProduct);
        return id.toString();
    }

    public Product getProductById(String id) {
        return products.stream().filter(product -> product.getId().equals(id)).findFirst().get();
    }

    public void changePrice(String id, BigDecimal price) {
        var product = this.getProductById((id));
        product.setPrice(price);
    }
}
