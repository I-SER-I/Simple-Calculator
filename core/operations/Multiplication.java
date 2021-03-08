package core.operations;

public class Multiplication implements Operation{
    @Override
    public double getResult(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }
}
