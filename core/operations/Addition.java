package core.operations;

public class Addition implements Operation {
    @Override
    public double getResult(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
}
