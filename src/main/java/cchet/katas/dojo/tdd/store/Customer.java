package cchet.katas.dojo.tdd.store;

public class Customer {

    private final int days;

    private final String name;

    private Customer(int days, String name) {
        this.days = days;
        this.name = name;
    }

    public static Customer of(final int days, final String name) {
        return new Customer(days, name);
    }

    public int getDays() {
        return days;
    }

    public String getName() {
        return name;
    }
}
