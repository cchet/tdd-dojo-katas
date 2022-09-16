package cchet.katas.dojo.tdd.store;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Bill {

    private final BigDecimal price;

    private final Customer customer;

    private final Set<Product> products;

    private final Map<Product, BigDecimal> successProducts;

    private final Map<Exception, List<Product>> errorProducts;

    private Bill(final Builder builder) {
        this.price = builder.price;
        this.customer = builder.customer;
        this.products = builder.products;
        this.successProducts = builder.successItems;
        this.errorProducts = builder.errorItems;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public Map<Product, BigDecimal> getSuccessProducts() {
        return successProducts;
    }

    public Map<Exception, List<Product>> getErrorProducts() {
        return errorProducts;
    }

    public static class Builder {
        private BigDecimal price;
        private Customer customer;
        private Set<Product> products;
        private Map<Product, BigDecimal> successItems;
        private Map<Exception, List<Product>> errorItems;

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }
        public Builder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder products(Set<Product> products) {
            this.products = products;
            return this;
        }

        public Builder successProducts(Map<Product, BigDecimal> successItems) {
            this.successItems = successItems;
            return this;
        }

        public Builder errorProducts(Map<Exception, List<Product>> errorItems) {
            this.errorItems = errorItems;
            return this;
        }

        public Bill build() {
            return new Bill(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return Objects.equals(price, bill.price) && Objects.equals(products, bill.products) && Objects.equals(successProducts, bill.successProducts) && Objects.equals(errorProducts, bill.errorProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, products, successProducts, errorProducts);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "sum=" + price +
                ", products=" + products +
                ", successItems=" + successProducts +
                ", errorItems=" + errorProducts +
                '}';
    }
}
