package core;

public class Main {
    public static void main(String[] args) {
        double result = 0;
        InputHandler handler = new InputHandler();
        var list = handler.read().getValue();
        result = Calculator.calculate(list.get(0), list.get(2), list.get(1));
        System.out.println(result);
    }
}