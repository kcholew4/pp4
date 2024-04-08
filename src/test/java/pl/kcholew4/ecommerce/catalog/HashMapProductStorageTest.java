package pl.kcholew4.ecommerce.catalog;

import org.junit.jupiter.api.Test;

import java.util.UUID;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class HashMapProductStorageTest {
    private static final String TEST_PRODUCT_NAME = "test product";

    @Test
    void itStoresNewProduct() {
        ProductStorage storage = thereIsProductStorage();
        Product product = thereIsExampleProduct();
        storage.add(product);
        List<Product> products = storage.allProducts();
        assertThat(products).hasSize(1).extracting(Product::getName).contains(TEST_PRODUCT_NAME);
    }

    private Product thereIsExampleProduct() {
        return new Product(UUID.randomUUID(), TEST_PRODUCT_NAME, "my des");
    }

    private ProductStorage thereIsProductStorage() {
        return new HashMapProductStorage();
    }

    @Test
    void itLoadsAllProducts() {

    }

    @Test
    void itLoadsProductById() {

    }
}
