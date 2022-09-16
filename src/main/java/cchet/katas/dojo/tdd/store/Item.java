package cchet.katas.dojo.tdd.store;

import java.math.BigDecimal;

public class Item {

    private final String id;

    private final int count;

    private final BigDecimal price;

    private final ItemType type;

    public Item(final Builder builder) {
        this.id = builder.id;
        this.count = builder.count;
        this.price = builder.price;
        this.type = builder.type;
    }

    public static Builder newFoodItemBuilder() {
        return new Builder(ItemType.FOOD);
    }

    public static Builder newElectronicsItemBuilder() {
        return new Builder(ItemType.ELECTRONICS);
    }

    public static Builder newFurnitureItemBuilder() {
        return new Builder(ItemType.FURNITURE);
    }

    public String getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ItemType getType() {
        return type;
    }

    public static class Builder {
        private String id;
        private int count;
        private BigDecimal price;
        private ItemType type;

        public Builder(ItemType type) {
            this.type = type;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder count(int count) {
            this.count = count;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}
