package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import core.Calculator;

public class CalculationTest {
    @ParameterizedTest
    @CsvSource({"1, Time, +", "2323, 12g, -", "Error, 1.983, *"})
    public void calculate_ShoudThrowNumberFormatException(String firstValue, String secondValue, String operator) {
        Assertions.assertThrows(java.lang.NumberFormatException.class, () -> Calculator.calculate(firstValue, secondValue, operator));
    }

    @ParameterizedTest
    @CsvSource({"1, 3, 0", "2323, 2, s", "43, 1.983, f"})
    public void calculate_ShoudThrowIllegalStateException(String firstValue, String secondValue, String operator) {
        Assertions.assertThrows(java.lang.IllegalStateException.class, () -> Calculator.calculate(firstValue, secondValue, operator));
    }
}
