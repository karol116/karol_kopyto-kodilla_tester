package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Sum", 6, 4, 199, 1995, true));
        stamps.add(new Stamp("John Adams", 4, 3, 15, 2007, true));
        stamps.add(new Stamp("Mahakala", 9, 7, 1111, 2020, false));
        stamps.add(new Stamp("Lillehammer", 6, 4, 25, 1993, true));
        stamps.add(new Stamp("Sum", 6, 4, 199, 1995, true));

        for (Stamp stamp : stamps)
            System.out.println(stamp);
        System.out.println("\nCollection size: " + stamps.size());

    }
}