package week03_hw;

public class Main {
    public static void main(String[] args) {
        // +
        Calculator calc = new Calculator(new AddOperation());
        System.out.println(calc.calculate(1,2));

        // -
        calc.setOperation(new SubstractOperation());
        System.out.println(calc.calculate(1,2));

        // *
        calc.setOperation(new MultiplyOperation());
        System.out.println(calc.calculate(1,2));

        // /
        calc.setOperation(new DivideOperation());
        System.out.println(calc.calculate(1,2));
    }
}
