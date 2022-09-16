package cchet.katas.dojo.tdd.store;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Set;

class BillCalculatorTest {

    // TODO: Items must be provided

    // TODO: No duplicate Items with the same id can be provided

    // TODO: A customer must be provided

    // TODO: A customer must be provided

    @Test
    void billNotNull_whenCalculated(){
        final Set<Item> items = Set.of(
                Item.newFoodItemBuilder().id("red-bull").count(1).price(new BigDecimal("1.00")).build(),
                Item.newElectronicsItemBuilder().id("mac-book").count(1).price(new BigDecimal("3000.00")).build(),
                Item.newFurnitureItemBuilder().id("chair").count(1).price(new BigDecimal("100.00")).build()
        );
        final Customer customer = Customer.of(0, "thomas");
        final BillCalculator billCalculator = BillCalculator.of(items, customer);

        final Bill actual = billCalculator.calculateBill();
        assertThat(actual).isNotNull();
    }
}

