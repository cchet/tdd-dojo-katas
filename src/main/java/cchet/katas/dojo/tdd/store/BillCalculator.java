package cchet.katas.dojo.tdd.store;

import java.math.BigDecimal;
import java.util.*;

public class BillCalculator {

    private static final List<FinalPriceCalculatorStrategy> CALCULATORS = List.of(
            new NewCustomerPriceStrategy(),
            new ShortTermCustomerPriceStrategy(),
            new LongTermCustomerPriceStrategy()
    );

    private final Set<Item> items;

    private final Customer customer;

    BillCalculator(Set<Item> items, Customer customer) {
        this.items = items;
        this.customer = customer;
    }

    public static BillCalculator of(final Set<Item> items, final Customer customer) {
        return new BillCalculator(items, customer);
    }

    public Bill calculateBill() {
        final Map<Item, BigDecimal> successfulItems = new HashMap<>();
        final Map<Exception, List<Item>> failedItems = new HashMap<>();
        BigDecimal sum = new BigDecimal("0.00");

        for (final var item : items             ) {
            try {
                final BigDecimal finalPrice = calculateFinalPrice(item);
                sum = sum.add(finalPrice);
                successfulItems.put(item, finalPrice);
            } catch (Exception e) {
                failedItems.computeIfAbsent(e, t -> new LinkedList<>());
                failedItems.get(e).add(item);
            }
        }

        return Bill.newBuilder()
                .sum(sum)
                .items(items)
                .successItems(successfulItems)
                .errorItems(failedItems)
                .build();
    }

    private BigDecimal calculateFinalPrice(final Item item) {
        return CALCULATORS.stream()
                .map(c -> c.calculate(item, customer))
                .filter(Objects::nonNull)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public Set<Item> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }
}
