package com.futurecollars.taskOne;

import java.util.Objects;

public class OwnMapImplementation implements OwnMap {

    private final int capacity = 250;
    private final Entry[] entires = new Entry[capacity];
    private int size = 0;

    public int getSize() {
        return this.size;
    }

    public boolean containsKey(String key) {
        if (key == null) {
            if (entires[0].getKey() == null) {
                return true;
            }
        }
        int location = hash(key.hashCode());
        Entry e = null;
        try {
            e = entires[location];
        } catch (NullPointerException ex) {

        }
        return e != null && e.getKey().equals(key);
    }

    public boolean containsValue(Object value) {
        for (Entry entry : entires) {
            if (entry != null && entry.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public String get(String key) {
        String ret = null;
        if (key == null) {
            Entry e = null;
            try {
                e = entires[0];
            } catch (NullPointerException ex) {

            }
            if (e != null) {
                return e.getValue();
            }
        } else {
            int location = hash(key.hashCode());
            Entry e = null;
            try {
                e = entires[location];
            } catch (NullPointerException ex) {

            }
            if (e != null && e.getKey().equals(key)) {
                return e.getValue();
            }
        }
        return ret;
    }

    public boolean put(String key, String val) {
        String ret = null;
        if (key == null) {
            ret = putForNullKey(val);
            return true;
        } else {
            int location = hash(key.hashCode());
            if (location >= capacity) {
                System.out.println("Rehashing required");
                return false;
            }
            Entry e = null;
            try {
                e = entires[location];
            } catch (NullPointerException ex) {

            }
            if (e != null && e.getKey().equals(key)) {
                e.setValue(val);
            } else {
                Entry eNew = new Entry();
                eNew.setKey(key);
                eNew.setValue(val);
                entires[location] = eNew;
                size++;
            }
        }
        return true;
    }

    private String putForNullKey(String val) {
        Entry e = null;
        try {
            e = entires[0];
        } catch (NullPointerException ex) {

        }
        String ret = null;
        if (e != null && e.getKey() == null) {
            ret = e.getValue();
            e.setValue(val);
            return ret;
        } else {
            Entry eNew = new Entry();
            eNew.setKey(null);
            eNew.setValue(val);
            entires[0] = eNew;
            size++;
        }
        return ret;
    }

    @Override
    public String remove(String key) {
        int location = hash(key.hashCode());
        if (entires[location].getKey().equals(key)) {
            entires[location] = null;
        }
        return key;
    }

    private int hash(int hashCode) {
        return hashCode % capacity;
    }
}


