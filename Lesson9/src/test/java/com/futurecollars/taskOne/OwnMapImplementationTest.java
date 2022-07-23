package com.futurecollars.taskOne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OwnMapImplementationTest {

    @Test
    public void shouldPutIntoMap() {
        OwnMapImplementation hashMap = new OwnMapImplementation();

        hashMap.put("key1", "value1");

        assertEquals("value1", hashMap.get("key1"));
    }

    @Test
    public void shouldNotPutIntoMapTwiceSameKey() {
        OwnMapImplementation hashMap = new OwnMapImplementation();

        hashMap.put("key1", "value1");
        hashMap.put("key1", "value123");

        assertEquals(1, hashMap.getSize());
        assertEquals("value123", hashMap.get("key1"));
    }

    @Test
    public void shouldFindKeyIfExists() {
        OwnMapImplementation hashMap = new OwnMapImplementation();

        hashMap.put("key1", "value1");

        assertTrue(hashMap.containsKey("key1"));
    }

    @Test
    public void shouldFindValueIfExists() {
        OwnMapImplementation hashMap = new OwnMapImplementation();

        hashMap.put("key1", "value1");

        assertTrue(hashMap.containsValue("value1"));
    }

    @Test
    public void shouldNotFindKeyIfNotExists() {
        OwnMapImplementation hashMap = new OwnMapImplementation();

        hashMap.put("key111111", "value1");

        assertFalse(hashMap.containsKey("key1"));
    }

    @Test
    public void shouldNotFindValueIfNotExists() {
        OwnMapImplementation hashMap = new OwnMapImplementation();

        hashMap.put("key1", "value111111");

        assertFalse(hashMap.containsValue("value1"));
    }

    @Test
    public void shouldRemoveKey() {
        OwnMapImplementation hashMap = new OwnMapImplementation();

        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        hashMap.put("key4", "value4");

        hashMap.remove("key2");

        assertFalse(hashMap.containsKey("key2"));
    }
}