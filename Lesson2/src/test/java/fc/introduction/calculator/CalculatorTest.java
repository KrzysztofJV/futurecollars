package fc.introduction.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void sum() {

        //given
        double firstNumber=2;
        double secondNumber=3;
        double thirdNumber=4;

        //when
        Calculator calculator = new Calculator();
        double sum1 = calculator.sum(firstNumber, secondNumber);
        double sum2 = calculator.sum(firstNumber, thirdNumber);
        double sum3 = calculator.sum(secondNumber, thirdNumber);

        //then
        Assertions.assertEquals(5,sum1);
        Assertions.assertEquals(6,sum2);
        Assertions.assertEquals(7,sum3);
    }

    @Test
    public void subtraction() {

        //given
        double firstNumber=2;
        double secondNumber=3;
        double thirdNumber=4;

        //when
        Calculator calculator = new Calculator();
        double sub1 = calculator.subtraction(firstNumber, secondNumber);
        double sub2 = calculator.subtraction(firstNumber, thirdNumber);
        double sub3 = calculator.subtraction(secondNumber, thirdNumber);

        //then
        Assertions.assertEquals(-1,sub1);
        Assertions.assertEquals(-2,sub2);
        Assertions.assertEquals(-1,sub3);
    }

    @Test
    void multiplication() {

        //given
        double firstNumber=2;
        double secondNumber=3;
        double thirdNumber=4;

        //when
        Calculator calculator = new Calculator();
        double mul1 = calculator.multiplication(firstNumber, secondNumber);
        double mul2 = calculator.multiplication(firstNumber, thirdNumber);
        double mul3 = calculator.multiplication(secondNumber, thirdNumber);

        //then
        Assertions.assertEquals(6,mul1);
        Assertions.assertEquals(8,mul2);
        Assertions.assertEquals(12,mul3);
    }

    @Test
    public void divide() {

        //given
        double firstNumber=2;
        double secondNumber=3;
        double thirdNumber=4;

        //when
        Calculator calculator = new Calculator();
        double div1 = calculator.divide(firstNumber, secondNumber);
        double div2 = calculator.divide(firstNumber, thirdNumber);
        double div3 = calculator.divide(secondNumber, thirdNumber);

        //then
        Assertions.assertEquals(0.6666666666666666,div1);
        Assertions.assertEquals(0.5,div2);
        Assertions.assertEquals(0.75,div3);
    }
}