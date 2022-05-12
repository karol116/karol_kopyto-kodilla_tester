package com.kodilla.collections.adv.exercises.homework;

public class Flight {

    private String arrival;
    private String departure;

    public Flight(String arrival, String departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "Flight from " + arrival + " to " + departure;
    }
}
