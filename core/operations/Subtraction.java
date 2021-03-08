package core.operations;

public class Subtraction implements Operation {
    @Override
    public double getResult(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }
}
