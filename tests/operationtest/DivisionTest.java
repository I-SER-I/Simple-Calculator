package tests.operationtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import core.operations.Division;

public class DivisionTest{
    @ParameterizedTest
    @CsvSource({"100, 5, 20", "-5, 100, -0.05", "1.983, 1.983, 1"})
    public void getResult_ShoudCalculateCorrectValue(double firstValue, double secondValue, double expected) {
        Assertions.assertEquals(expected, new Division().getResult(firstValue, secondValue));
    }

    @ParameterizedTest
    @CsvSource({"87923, 0", "-5, 0", "0.01, 0"})
    public void getResult_ShoudThrowIllegalArgumentException(double firstValue, double secondValue) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Division().getResult(firstValue, secondValue));
    }
}
