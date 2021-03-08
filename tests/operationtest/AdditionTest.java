package tests.operationtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import core.operations.Addition;

public class AdditionTest{
    @ParameterizedTest
    @CsvSource({"100, 5, 105", "5, -100, -95", "2.28, 2.2, 4.48"})
    public void getResult_ShoudCalculateCorrectValue(double firstValue, double secondValue, double expected) {
        Assertions.assertEquals(expected, new Addition().getResult(firstValue, secondValue));
    }
}
