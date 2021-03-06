package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Charleroi", "Bergamo"));
        flights.add(new Flight("Alicante", "Athens"));
        flights.add(new Flight("Birmingham", "Dublin"));
        flights.add(new Flight("Bergamo", "Pescara"));
        flights.add(new Flight("Bergamo", "Heathrow"));
        flights.add(new Flight("Bergamo", "Hamburg"));
        flights.add(new Flight("Tallinn", "Athens"));

        return flights;
    }
}