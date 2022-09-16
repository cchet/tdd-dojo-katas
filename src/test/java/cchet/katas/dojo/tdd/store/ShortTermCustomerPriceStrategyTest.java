package cchet.katas.dojo.tdd.store;

import org.junit.jupiter.api.Nested;

class ShortTermCustomerPriceStrategyTest {

    @Nested
    class CommonTest {
        // TODO: A short term customer has >=365 days

        // TODO: If strategy cannot be applied null ois returned
    }

    @Nested
    class FoodItemTest {
        // TODO: A short term customer customer gets 10% of FOOD items gross price

        // TODO: A short term customer can only buy FOOD items with count 10

        // TODO: A short term customer can only buy 20 FOOD items
    }

    @Nested
    class ElectronicsItemTest {
        // TODO: A short term customer gets 8% of ELECTRONICS items gross price

        // TODO: A short term customer can only buy 10 ELECTRONICS items

        // TODO: A short term customer can only buy ELECTRONICS items with count 4
    }

    @Nested
    class FurnitureItemsTest {
        // TODO: A new customer gets 5% of FURNITURE items gross price

        // TODO: A new customer can only buy 4 FURNITURE items

        // TODO: A new customer can only buy FURNITURE items with count 2
    }
}
