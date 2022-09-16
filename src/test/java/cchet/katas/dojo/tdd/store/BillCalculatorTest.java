package cchet.katas.dojo.tdd.store;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

class BillCalculatorTest {

    // TODO: products must be provided

    // TODO: No duplicate products with the same id can be provided

    // TODO: A customer must be provided

    /**
     * This test must still work when you have applied the refactorings!!!!!
     */
    @Test
    void correctBill_whenCalculated() {
        final Product foodProduct = Product.newFoodItemBuilder().id("red-bull").count(1).price(new BigDecimal("1.00")).build();
        final Product electronicsProduct = Product.newElectronicsItemBuilder().id("mac-book").count(1).price(new BigDecimal("3000.00")).build();
        final Product furnitureProduct = Product.newFurnitureItemBuilder().id("chair").count(1).price(new BigDecimal("100.00")).build();
        final Set<Product> products = Set.of(foodProduct, electronicsProduct, furnitureProduct);
        final Customer customer = Customer.of(0, "thomas");

        final BillCalculator billCalculator = BillCalculator.of(products, customer);
        final Bill bill = Bill.newBuilder()
                .price(new BigDecimal("3726.10"))
                .products(products)
                .successProducts(Map.of(
                        foodProduct, new BigDecimal("1.10"),
                        electronicsProduct, new BigDecimal("3600.00"),
                        furnitureProduct, new BigDecimal("125.00")
                ))
                .errorProducts(Map.of())
                .build();
        final Bill actual = billCalculator.calculateBill();

        assertThat(actual).isEqualTo(bill);
    }
}

