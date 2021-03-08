package tests.operationtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import core.operations.Subtraction;

public class SubtractionTest{
    @ParameterizedTest
    @CsvSource({"100, 5, 95", "5, 100, -95", "1.983, 1.983, 0"})
    public void getResult_ShoudCalculateCorrectValue(double firstValue, double secondValue, double expected) {
        Assertions.assertEquals(expected, new Subtraction().getResult(firstValue, secondValue));
    }
}