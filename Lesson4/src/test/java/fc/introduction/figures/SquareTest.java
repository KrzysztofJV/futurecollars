package fc.introduction.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void shouldCalculateAreaWithWidthTwo() {
        //given
        double width = 2;
        double height = 2;

        //when
        Square square = new Square(height,width);
        double result = square.getArea();

        //then
        Assertions.assertEquals(4, result);
    }

    @Test
    void shouldCalculateExceptionWithWidthZero() {
        //given
        double width = 0;
        double height = 5;

        //when
        RuntimeException result = assertThrows(RuntimeException.class, () -> new Square(height,width));

        //then
        Assertions.assertEquals("Error: the side of the square must be greater than zero.", result.getMessage());
    }

    @Test
    void shouldCalculateExceptionWithWidthMinusFive() {
        //given
        double width = -5;
        double height = 4;

        //when
        RuntimeException result = assertThrows(RuntimeException.class, () -> new Square(height,width));

        //then
        Assertions.assertEquals("Error: the side of the square must be greater than zero.", result.getMessage());
    }

    @Test
    void shouldCalculatePerimeterWithWidthFour() {
        //given
        double width = 4;
        double height = 4;

        //when
        Square square = new Square(height,width);
        double result = square.getPerimeter();

        //then
        Assertions.assertEquals(16, result);
    }
}