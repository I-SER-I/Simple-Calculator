package core.operations;

public class Division implements Operation{
    @Override
    public double getResult(double firstValue, double secondValue) throws IllegalArgumentException {
        if (secondValue == 0) throw new IllegalArgumentException();
        return firstValue / secondValue;
    }
}
