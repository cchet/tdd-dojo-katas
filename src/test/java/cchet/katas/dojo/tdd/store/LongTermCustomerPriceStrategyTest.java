package cchet.katas.dojo.tdd.store;

import org.junit.jupiter.api.Nested;

class LongTermCustomerPriceStrategyTest {

    @Nested
    class CommonTest {
        // TODO: A short term customer has >=730 days

        // TODO: If strategy cannot be applied null ois returned
    }

    @Nested
    class FoodItemTest {
        // TODO: A short term customer customer gets 15% of FOOD items gross price

        // TODO: A short term customer can only buy 40 FOOD items
    }

    @Nested
    class ElectronicsItemTest {
        // TODO: A short term customer gets 12% of ELECTRONICS items gross price

        // TODO: A short term customer can only buy 20 ELECTRONICS items
    }

    @Nested
    class FurnitureItemsTest {
        // TODO: A new customer gets 10% of FURNITURE items gross price

        // TODO: A new customer can only buy 8 FURNITURE items
    }
}
