package cchet.katas.dojo.tdd.store;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ItemTest {

    @Nested
    class CommonTest {

        @Nested
        class IdTest {
            // TODO: A item must have an non-blank id
            @Test
            void throwsIllegalArgumentException_whenIdIsNull(){
                assertThatIllegalArgumentException().isThrownBy(() -> Item.newFoodItemBuilder().price(BigDecimal.ONE).count(1).build());
            }

            // TODO: A item id must not be larger than 50 characters

            // TODO: A item id must not contain spaces
        }

        @Nested
        class CountTest {
            // TODO: A item cannot have a negative count

            // TODO: A item cannot have zero as count
        }

        @Nested
        class PriceTest {
            // TODO: A item cannot have a negative price

            // TODO: A item cannot have a zero price
        }
    }

    @Nested
    class FoodItemTest {
        // TODO: A FOOD item cannot cost more than 100

        // TODO: A FOOD item cannot have a count larger than 50
    }

    @Nested
    class ElectronicsItemTest {
        // TODO: A ELECTRONICS item cannot cost less than 100 or more than 10.000

        // TODO: A ELECTRONICS item cannot have a count larger than 50
    }

    @Nested
    class FurnitureItemTest {
        // TODO: A FURNITURE item cannot cost less than 50 or more than 50.000

        // TODO: A FURNITURE item cannot have a count larger than 10
    }
}
