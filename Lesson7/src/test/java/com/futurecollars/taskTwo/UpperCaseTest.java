package com.futurecollars.taskTwo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {

    @ParameterizedTest
    @NullSource
    void shouldReturnExceptionForNull(String text) {
        assertThrows(RuntimeException.class, () -> {
            UpperCase.changeToUpperCase(text);
        });
    }

    @ParameterizedTest
    @EmptySource
    void shouldReturnEmptyString(String text) {
        assertEquals("", UpperCase.changeToUpperCase(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"FIRST", "second", "tHIRd"})
    void shouldChangeToUpperCase(String text) {
        assertEquals(text.toUpperCase(), UpperCase.changeToUpperCase(text));
    }
}