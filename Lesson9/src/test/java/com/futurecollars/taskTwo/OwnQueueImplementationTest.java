package com.futurecollars.taskTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OwnQueueImplementationTest {

    public OwnQueueImplementation ownQueueImplementation;

    @BeforeEach
    void setUp() {
        ownQueueImplementation = new OwnQueueImplementation();
        ownQueueImplementation.add(0);
        ownQueueImplementation.add(1);
        ownQueueImplementation.add(2);
        ownQueueImplementation.add(3);
        ownQueueImplementation.add(4);
        ownQueueImplementation.add(5);
    }

    // addElement na pustej liscie
    // addElement na jednoelementowej liscie
    // addElement na kilku elementowej liscie
    @Test
    void addElement() {
        assertTrue(ownQueueImplementation.add(6));
    }

    @Test
    void size() {
        assertEquals(6, ownQueueImplementation.size());
    }

    // remove na pustej liscie
    // remove na jednoelementowej liscie
    // remove na kilku elementowej liscie
    @Test
    void removeElement() {
        int[] expectedElements = {0, 1, 2, 3, 4, 5};
        int iterator = 0;
        while (ownQueueImplementation.size() != 0) {
            assertEquals(expectedElements[iterator], ownQueueImplementation.remove());
            iterator++;
        }
    }

    // element na pustej liscie
    // element na jednoelementowej liscie
    // element na kilku elementowej liscie
    @Test
    void element() {
        int[] expectedElements = {0, 1, 2, 3, 4, 5};
        int iterator = 0;
        while (ownQueueImplementation.size() != 0) {
            assertEquals(expectedElements[iterator], ownQueueImplementation.element());
            ownQueueImplementation.remove();
            iterator++;
        }
    }
}