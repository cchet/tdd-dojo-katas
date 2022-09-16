package cchet.katas.dojo.tdd.store;

import java.math.BigDecimal;

public interface FinalPriceCalculatorStrategy {

    BigDecimal calculate(Item item, Customer customer);
}
