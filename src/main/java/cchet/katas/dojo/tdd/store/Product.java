package cchet.katas.dojo.tdd.store;

import java.math.BigDecimal;

public class Product {

    private final String id;

    private final int count;

    private final BigDecimal price;

    private final ProductType type;

    public Product(final Builder builder) {
        this.id = builder.id;
        this.count = builder.count;
        this.price = builder.price;
        this.type = builder.type;
    }

    public static Builder newFoodItemBuilder() {
        return new Builder(ProductType.FOOD);
    }

    public static Builder newElectronicsItemBuilder() {
        return new Builder(ProductType.ELECTRONICS);
    }

    public static Builder newFurnitureItemBuilder() {
        return new Builder(ProductType.FURNITURE);
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

    public ProductType getType() {
        return type;
    }

    public static class Builder {
        private String id;
        private int count;
        private BigDecimal price;
        private final ProductType type;

        public Builder(ProductType type) {
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

        public Product build() {
            return new Product(this);
        }
    }

    @Override
    public String toString() {
        return "product{" +
                "id='" + id + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}
