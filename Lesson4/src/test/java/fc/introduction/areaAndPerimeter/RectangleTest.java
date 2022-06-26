package fc.introduction.areaAndPerimeter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateAreaWithWidthTwoAndHeightThree() {
        //given
        double width = 2;
        double height = 3;

        //when
        Rectangle rectangle = new Rectangle(width, height);
        double result = rectangle.getArea();

        //then
        Assertions.assertEquals(6, result);
    }

    @Test
    void shouldCalculateExceptionWithSideZero() {
        //given
        double width = 0;
        double height = 4;

        //when
        RuntimeException result = assertThrows(RuntimeException.class, () -> new Rectangle(width,height));

        //then
        Assertions.assertEquals("Error: the sides of rectangle must be grater then zero.", result.getMessage());
    }

    @Test
    void shouldCalculateExceptionWithSideMinusFive() {
        //given
        double width = -5;
        double height = 3;

        //when
        RuntimeException result = assertThrows(RuntimeException.class, () -> new Rectangle(width,height));

        //then
        Assertions.assertEquals("Error: the sides of rectangle must be grater then zero.", result.getMessage());
    }

    @Test
    void shouldCalculatePerimeterWithWidthFourAndHeightFive() {
        //given
        double width = 4;
        double height = 5;

        //when
        Rectangle rectangle = new Rectangle(width, height);
        double result = rectangle.getPerimeter();

        //then
        Assertions.assertEquals(18, result);
    }

}