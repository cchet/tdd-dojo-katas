package cchet.katas.dojo.tdd.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class TaxCalculatorTest {

    private TaxCalculator taxCalculator;

    @BeforeEach
    void init() {
        taxCalculator = new TaxCalculator();
    }

    private static class TaxCalculatorTestValues implements ArgumentsProvider {

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
            return Stream.of(
                    Arguments.arguments(new BigDecimal("10.00"), new BigDecimal("3.00"), new BigDecimal("0.30")),
                    Arguments.arguments(new BigDecimal("10.00"), new BigDecimal("33.00"), new BigDecimal("3.30")),
                    Arguments.arguments(new BigDecimal("10.00"), new BigDecimal("33.33"), new BigDecimal("3.33")),
                    Arguments.arguments(new BigDecimal("10.00"), new BigDecimal("16.66"), new BigDecimal("1.67")),
                    // Trigger normalization
                    Arguments.arguments(new BigDecimal("10"), new BigDecimal("3.00"), new BigDecimal("0.30")),
                    Arguments.arguments(new BigDecimal("10.0"), new BigDecimal("3.00"), new BigDecimal("0.30")),
                    Arguments.arguments(new BigDecimal("10.00"), new BigDecimal("3.0"), new BigDecimal("0.30")),
                    Arguments.arguments(new BigDecimal("10.00"), new BigDecimal("3"), new BigDecimal("0.30"))
            );
        }
    }

    @ParameterizedTest
    @ArgumentsSource(TaxCalculatorTestValues.class)
    void tax_whenPriceAndTax(final BigDecimal price, final BigDecimal tax, final BigDecimal result) {
        assertThat(taxCalculator.calculateTax(price, tax)).isEqualTo(result);
    }

    @Test
    void throwsIllegalArgumentException_whenPriceIsNull() {
        assertThatIllegalArgumentException().isThrownBy(() -> taxCalculator.calculateTax(null, BigDecimal.TEN));
    }

    @ParameterizedTest
    @ValueSource(strings = {"0.00", "-1.00"})
    void throwsIllegalArgumentException_whenPriceIsInvalid(final String value) {
        assertThatIllegalArgumentException().isThrownBy(() -> taxCalculator.calculateTax(new BigDecimal(value), BigDecimal.TEN));
    }

    @Test
    void throwsIllegalArgumentException_whenTaxIsNull() {
        assertThatIllegalArgumentException().isThrownBy(() -> taxCalculator.calculateTax(BigDecimal.TEN, null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"0.00", "-1.00"})
    void throwsIllegalArgumentException_whenTaxIsInvalid(final String value) {
        assertThatIllegalArgumentException().isThrownBy(() -> taxCalculator.calculateTax(BigDecimal.TEN, new BigDecimal(value)));
    }
}
