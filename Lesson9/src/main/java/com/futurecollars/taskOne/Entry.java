package com.futurecollars.taskOne;

import java.util.Objects;

public class Entry {

    String key;
    String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int prime = 13;
        int mul = 11;
        if (key != null) {
            return prime * mul + key.hashCode();
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !this.getClass().getName().equals(o.getClass().getName())) {
            return false;
        }
        Entry e = (Entry) o;
        return Objects.equals(this.key, e.key);
    }
}
