package com.kodilla.spotbugs;

import java.util.Objects;

public class BadCodeExample {
    private String type;
    private static final double PI = Math.PI;

    public BadCodeExample(String type) {
        this.type = type;
    }

    public double getPi() {
        return PI;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadCodeExample badCodeExample = (BadCodeExample) o;
        return Objects.equals(type, badCodeExample.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}