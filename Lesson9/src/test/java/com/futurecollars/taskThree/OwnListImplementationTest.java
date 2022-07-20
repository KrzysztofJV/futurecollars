package com.futurecollars.taskThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OwnListImplementationTest {

    public OwnListImplementation ownListImplementation;

    @BeforeEach
    void setUp() {
        ownListImplementation = new OwnListImplementation();
        ownListImplementation.add(0);
        ownListImplementation.add(1);
        ownListImplementation.add(2);
        ownListImplementation.add(3);
        ownListImplementation.add(4);
    }

    @Test
    void addElement() {
        ownListImplementation.add(5);
        ownListImplementation.add(6);
        ownListImplementation.add(7);
        ownListImplementation.add(8);
        ownListImplementation.add(9);
        ownListImplementation.add(10);
        ownListImplementation.add(11);
        assertTrue(ownListImplementation.add(11));
    }

    @Test
    void getElement() {
        assertEquals(3, ownListImplementation.get(3));
    }

    @Test
    void shouldReturnException() {
        assertThrows(RuntimeException.class, () -> {
            ownListImplementation.get(8);
        });
    }

    @Test
    void shouldRemoveElement_3() {
        assertTrue(ownListImplementation.remove(3));
    }

    @Test
    void getSizeList() {
        assertEquals(5, ownListImplementation.size());
    }
}