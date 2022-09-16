package cchet.katas.dojo.tdd.store;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bill {

    private final BigDecimal sum;

    private final Set<Item> items;

    private final Map<Item, BigDecimal> successItems;

    private final Map<Exception, List<Item>> errorItems;

    private Bill(final Builder builder) {
        this.sum = builder.sum;
        this.items = builder.items;
        this.successItems = builder.successItems;
        this.errorItems = builder.errorItems;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public BigDecimal getSum() {
        return sum;
    }

    public Set<Item> getItems() {
        return items;
    }

    public Map<Item, BigDecimal> getSuccessItems() {
        return successItems;
    }

    public Map<Exception, List<Item>> getErrorItems() {
        return errorItems;
    }

    public static class Builder {
        private BigDecimal sum;
        private Set<Item> items;
        private Map<Item, BigDecimal> successItems;
        private Map<Exception, List<Item>> errorItems;

        public Builder sum(BigDecimal sum) {
            this.sum = sum;
            return this;
        }

        public Builder items(Set<Item> items) {
            this.items = items;
            return this;
        }

        public Builder successItems(Map<Item, BigDecimal> successItems) {
            this.successItems = successItems;
            return this;
        }

        public Builder errorItems(Map<Exception, List<Item>> errorItems) {
            this.errorItems = errorItems;
            return this;
        }

        public Bill build() {
            return new Bill(this);
        }
    }
}
