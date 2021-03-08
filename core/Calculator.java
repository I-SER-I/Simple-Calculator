package core;
import core.operations.*;

public class Calculator {
    private Calculator() {}
    public static double calculate(String firstRawValue, String secondRawValue, String rawOperation) throws NumberFormatException, IllegalStateException {
        double firstValue = 0;
        double secondValue = 0;
        firstValue = Double.parseDouble(firstRawValue);
        secondValue = Double.parseDouble(secondRawValue);
        return switch (rawOperation) {
            case "+" -> new Addition().getResult(firstValue, secondValue);
            case "-" -> new Subtraction().getResult(firstValue, secondValue);
            case "*" -> new Multiplication().getResult(firstValue, secondValue);
            case "/" -> new Division().getResult(firstValue, secondValue);
            default -> throw new IllegalStateException("Unexpected value: " + rawOperation);
        };
    }
}