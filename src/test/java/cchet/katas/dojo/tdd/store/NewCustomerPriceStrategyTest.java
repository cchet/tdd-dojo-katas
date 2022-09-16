package cchet.katas.dojo.tdd.store;

import org.junit.jupiter.api.Nested;

class NewCustomerPriceStrategyTest {

    @Nested
    class CommonTest {
        // TODO: A new customer has zero days

        // TODO: If strategy cannot be applied null ois returned
    }

    @Nested
    class FoodItemTest {
        // TODO: A new customer gets 10% of FOOD items nett price

        // TODO: A new customer can only buy FOOD items with count 5

        // TODO: A new customer can only buy 10 FOOD items
    }

    @Nested
    class ElectronicsItemTest {
        // TODO: A new customer gets 8% of ELECTRONICS items nett price

        // TODO: A new customer can only buy 5 ELECTRONICS items

        // TODO: A new customer can only buy ELECTRONICS items with count 2
    }

    @Nested
    class FurnitureItemsTest {
        // TODO: A new customer gets 5% of FURNITURE items nett price

        // TODO: A new customer can only buy 2 FURNITURE items

        // TODO: A new customer can only buy FURNITURE items with count 1
    }
}
