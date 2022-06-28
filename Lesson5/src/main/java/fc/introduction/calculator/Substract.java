package fc.introduction.calculator;

public class Substract implements Operation{

    @Override
    public double calculate(double firstValue, double secondValue) {
        return firstValue-secondValue;
    }
}
