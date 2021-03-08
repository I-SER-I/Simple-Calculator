package core;
import core.operations.*;

public class Calculator {
    private Calculator() {}

    /**
     * 
     * @param firstRawValue первое значение
     * @param secondRawValue второе значение
     * @return результат операции
     * @param rawOperation операция
     * @throws NumberFormatException если указано не число или число не содержит неизвестный символ
     * @throws IllegalStateException если указана неизвестная операция
     */
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