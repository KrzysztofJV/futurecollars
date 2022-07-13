package com.futurecollars.lesson7_1;

import com.futurecollars.taskOne.Numbers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, 0, 4, -12})
    void checkIsEven_shouldReturnTrueForEvenNumbers(int number) {
        assertTrue(Numbers.checkIsEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 115, Integer.MAX_VALUE})
    void checkIsEven_shouldReturnFalseForOddNumbers(int number) {
        assertFalse(Numbers.checkIsEven(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"-35353:19", "-18:9", "1000:1", "756:18", "1200:3"}, delimiter = ':')
    void getSumOfDigits_shouldReturnSumOfDigitsForGivenNumbers(int number, int expected) {
        assertEquals(expected, Numbers.getSumOfDigits(number));
    }
}