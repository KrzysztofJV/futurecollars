package fc.introduction.calculator;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(2,5));
        System.out.println(calculator.subtraction(2,5));
        System.out.println(calculator.multiplication(2,5));
        System.out.println(calculator.division(2,5));
    }

    Sum sum = new Sum();
    Substract substract = new Substract();
    Multiply multiply = new Multiply();
    Divide divide = new Divide();

    public double addition(double firstValue, double secondValue) {
        return sum.calculate(firstValue,secondValue);
    }

    public double subtraction(double firstValue, double secondValue) {
        return substract.calculate(firstValue,secondValue);
    }

    public double multiplication(double firstValue, double secondValue) {
        return multiply.calculate(firstValue,secondValue);
    }

    public double division(double firstValue, double secondValue) {
        return divide.calculate(firstValue,secondValue);
    }
}
