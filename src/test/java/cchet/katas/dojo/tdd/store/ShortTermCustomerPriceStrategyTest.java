package cchet.katas.dojo.tdd.store;

import org.junit.jupiter.api.Nested;

class ShortTermCustomerPriceStrategyTest {

    @Nested
    class CommonTest {
        // TODO: A short term customer has >=365 days

        // TODO: If strategy cannot be applied null ois returned
    }

    @Nested
    class FoodProductTest {
        // TODO: A short term customer customer pays the full price

        // TODO: A short term customer can only buy FOOD products with count 10

        // TODO: A short term customer can only buy 20 FOOD products
    }

    @Nested
    class ElectronicsProductTest {
        // TODO: A short term customer pays the full products gross price

        // TODO: A short term customer can only buy 10 ELECTRONICS products

        // TODO: A short term customer can only buy ELECTRONICS products with count 4
    }

    @Nested
    class FurnitureItemsTest {
        // TODO: A new customer gets 5% of FURNITURE products gross price

        // TODO: A new customer can only buy 4 FURNITURE products

        // TODO: A new customer can only buy FURNITURE products with count 2
    }
}
