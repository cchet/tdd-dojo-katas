package cchet.katas.dojo.tdd.store;

import java.math.BigDecimal;

public enum ProductType {
    FOOD(new BigDecimal("10.00")),
    ELECTRONICS( new BigDecimal("20.00")),
    FURNITURE(new BigDecimal("25.00"));

    public final BigDecimal taxRate;

    ProductType(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }
}
