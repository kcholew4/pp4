package pl.kcholew4.creditcard;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class CreditCardTest {
    @Test
    void itAssignsCredit() {
        // Arrange
        CreditCard card = new CreditCard();
        // Act
        card.assignCredit(BigDecimal.valueOf(1000));
        // Assert
        assert BigDecimal.valueOf(1000).equals(card.getBalance());
    }

    @Test
    void itAssignsCreditV2() {
        // Arrange
        CreditCard card = new CreditCard();
        // Act
        card.assignCredit(BigDecimal.valueOf(1500));
        // Assert
        assert BigDecimal.valueOf(1500).equals(card.getBalance());
    }
}
