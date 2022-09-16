package cchet.katas.dojo.tdd.store;

import org.junit.jupiter.api.Nested;

class LongTermCustomerPriceStrategyTest {

    @Nested
    class CommonTest {
        // TODO: A short term customer has >=730 days

        // TODO: If strategy cannot be applied null ois returned
    }

    @Nested
    class FoodProductTest {
        // TODO: A short term customer customer gets 15% of FOOD products gross price

        // TODO: A short term customer can only buy 40 FOOD products
    }

    @Nested
    class ElectronicsProductTest {
        // TODO: A short term customer gets 12% of ELECTRONICS products gross price

        // TODO: A short term customer can only buy 20 ELECTRONICS products
    }

    @Nested
    class FurnitureItemsTest {
        // TODO: A new customer gets 10% of FURNITURE products gross price

        // TODO: A new customer can only buy 8 FURNITURE products
    }
}
