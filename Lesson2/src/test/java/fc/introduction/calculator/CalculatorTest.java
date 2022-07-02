package fc.introduction.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void shouldAdd() {

        //given
        double firstNumber=2;
        double secondNumber=3;

        //when
        Calculator calculator = new Calculator();
        double result = calculator.sum(firstNumber, secondNumber);

        //then
        Assertions.assertEquals(5,result);
    }

    @Test
    public void shouldSubtract() {

        //given
        double firstNumber=2;
        double secondNumber=3;

        //when
        Calculator calculator = new Calculator();
        double result = calculator.subtract(firstNumber, secondNumber);

        //then
        Assertions.assertEquals(-1,result);
    }

    @Test
    void shouldMultiply() {

        //given
        double firstNumber=2;
        double secondNumber=3;

        //when
        Calculator calculator = new Calculator();
        double result = calculator.multiply(firstNumber, secondNumber);

        //then
        Assertions.assertEquals(6,result);
    }

    @Test
    public void shouldDivide() {

        //given
        double firstNumber=2;
        double secondNumber=3;

        //when
        Calculator calculator = new Calculator();
        double result = calculator.divide(firstNumber, secondNumber);

        //then
        Assertions.assertEquals(0.6, result, 0.1);
    }
}