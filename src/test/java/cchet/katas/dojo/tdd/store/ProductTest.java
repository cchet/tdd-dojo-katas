package cchet.katas.dojo.tdd.store;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ProductTest {

    @Nested
    class CommonTest {

        // TODO: A product must have an non-blank id

        // TODO: A product id must not be larger than 50 characters

        // TODO: A product id must not contain spaces

        // TODO: A product cannot have a negative count

        // TODO: A product cannot have zero as count

        // TODO: A product cannot have a negative price

        // TODO: A product cannot have a zero price
    }

    @Nested
    class FoodProductTest {
        // TODO: A FOOD product cannot cost more than 100

        // TODO: A FOOD product cannot have a count larger than 50
    }

    @Nested
    class ElectronicsProductTest {
        // TODO: A ELECTRONICS product cannot cost less than 100 or more than 10.000

        // TODO: A ELECTRONICS product cannot have a count larger than 50
    }

    @Nested
    class FurnitureProductTest {
        // TODO: A FURNITURE product cannot cost less than 50 or more than 50.000

        // TODO: A FURNITURE product cannot have a count larger than 10
    }
}
