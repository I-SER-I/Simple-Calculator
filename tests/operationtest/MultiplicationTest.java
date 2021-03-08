package tests.operationtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import core.operations.Multiplication;

public class MultiplicationTest{
    @ParameterizedTest
    @CsvSource({"10872.2324, 0, 0", "-2, -100, 200", "0.5, 2, 1"})
    public void getResult_ShoudCalculateCorrectValue(double firstValue, double secondValue, double expected) {
        Assertions.assertEquals(expected, new Multiplication().getResult(firstValue, secondValue));
    }
}
