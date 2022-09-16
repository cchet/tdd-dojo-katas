package cchet.katas.dojo.tdd.store;

import java.math.BigDecimal;
import java.util.*;

public class BillCalculator {

    private static final TaxCalculator taxCalculator = new TaxCalculator();

    private final Set<Product> products;

    private final Customer customer;

    BillCalculator(Set<Product> products, Customer customer) {
        this.products = products;
        this.customer = customer;
    }

    public static BillCalculator of(final Set<Product> products, final Customer customer) {
        return new BillCalculator(products, customer);
    }

    public Bill calculateBill() {
        final Map<Product, BigDecimal> successProducts = new HashMap<>();
        final Map<Exception, List<Product>> errorProducts = new HashMap<>();
        BigDecimal sum = new BigDecimal("0.00");

        for (final var product : products) {
            try {
                final BigDecimal finalPrice = calculateProductsFinalPrice(product);
                sum = sum.add(finalPrice);
                successProducts.put(product, finalPrice);
            } catch (Exception e) {
                errorProducts.computeIfAbsent(e, t -> new LinkedList<>());
                errorProducts.get(e).add(product);
            }
        }

        return Bill.newBuilder()
                .price(sum)
                .customer(customer)
                .products(products)
                .successProducts(successProducts)
                .errorProducts(errorProducts)
                .build();
    }

    private BigDecimal calculateProductsFinalPrice(final Product product) {
        return product.getPrice().add(taxCalculator.calculateTax(product.getPrice(), product.getType().taxRate));
    }
}
