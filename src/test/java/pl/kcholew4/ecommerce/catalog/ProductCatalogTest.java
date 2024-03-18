package pl.kcholew4.ecommerce.catalog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import java.math.BigDecimal;
import java.util.List;

public class ProductCatalogTest {
    @Test
    void itListsAvailableProducts() {
        ProductCatalog catalog = new ProductCatalog();

        List<Product> products = catalog.allProducts();

        assert products.isEmpty();
    }

    @Test
    void itAllowsToAddProduct() {
        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct("Lego set 8083", "Nice on!");
        List<Product> products = catalog.allProducts();

        assertThat(products).hasSize(1);
    }

    @Test
    void itLoadSingleProductById() {
        ProductCatalog catalog = new ProductCatalog();
        String id = catalog.addProduct("Lego set 8083", "Nice one!");
        Product loaded = catalog.getProductById(id);

        assertThat(id).isEqualTo(loaded.getId());
    }

    @Test
    void itAllowsPriceChange() {
        ProductCatalog catalog = new ProductCatalog();
        String id = catalog.addProduct("Lego set 8083", "Nice one!");

        catalog.changePrice(id, BigDecimal.valueOf(10.10));
        Product loaded = catalog.getProductById(id);

        assertThat(BigDecimal.valueOf(10.10)).isEqualTo(loaded.getPrice());
    }
}
