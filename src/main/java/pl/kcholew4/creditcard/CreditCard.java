package pl.kcholew4.creditcard;

import java.math.BigDecimal;

public class CreditCard {
    private BigDecimal creditLimit;

    void assignCredit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getBalance() {
        return creditLimit;
    }
}
