package cchet.katas.dojo.tdd.store;

import org.junit.jupiter.api.Nested;

class NewCustomerPriceStrategyTest {

    @Nested
    class CommonTest {
        // TODO: The calculator is activated if the customer has zero days

        // TODO: If strategy cannot be applied null ois returned
    }

    @Nested
    class FoodProductTest {
        // TODO: A new customer gets 10% of FOOD products nett price

        // TODO: A new customer can only buy FOOD products with count 5

        // TODO: A new customer can only buy 10 FOOD products
    }

    @Nested
    class ElectronicsProductTest {
        // TODO: A new customer gets 8% of ELECTRONICS products nett price

        // TODO: A new customer can only buy 5 ELECTRONICS products

        // TODO: A new customer can only buy ELECTRONICS products with count 2
    }

    @Nested
    class FurnitureItemsTest {
        // TODO: A new customer gets 5% of FURNITURE products nett price

        // TODO: A new customer can only buy 2 FURNITURE products

        // TODO: A new customer can only buy FURNITURE products with count 1
    }
}
