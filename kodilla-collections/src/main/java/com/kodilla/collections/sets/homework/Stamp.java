package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    String name;
    int length;
    int width;
    double value;
    int publicationYear;
    boolean isStamped;

    public Stamp(String name, int length, int width, double value, int publicationYear, boolean isStamped) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.value = value;
        this.publicationYear = publicationYear;
        this.isStamped = isStamped;
    }

    public String getStampInformation() {
        if (isStamped == true)
            return "Yes";
        else
            return "No";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return length == stamp.length && width == stamp.width && Double.compare(stamp.value, value) == 0
                && publicationYear == stamp.publicationYear
                && isStamped == stamp.isStamped
                && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, width, value, publicationYear, isStamped);
    }

    @Override
    public String toString() {
        return "\nStamp {" +
                "name = '" + name + '\'' +
                ", dimensions = " + length +
                ", width = " + width +
                ", value = " + value +
                ", publicationYear = " + publicationYear +
                ", isStamped = " + getStampInformation() +
                '}';
    }
}