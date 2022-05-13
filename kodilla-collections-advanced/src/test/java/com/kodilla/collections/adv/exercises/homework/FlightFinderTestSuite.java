package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void AddFlight() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Charleroi", "Bergamo"));
        flights.add(new Flight("Birmingham", "Dublin"));
        flights.add(new Flight("Tallinn", "Charleroi"));

        assertEquals(3, flights.size());
    }

    @Test
    public void testFindFlightFrom() {
        List<Flight> result = FlightFinder.findFlightsFrom("Bergamo");

        List<Flight> expectedResults = new ArrayList<>();
        expectedResults.add(new Flight("Bergamo", "Pescara"));
        expectedResults.add(new Flight("Bergamo", "Heathrow"));
        expectedResults.add(new Flight("Bergamo", "Hamburg"));

        assertEquals(expectedResults.toString(), result.toString());
    }

    @Test
    public void testFindFlightTo() {
        List<Flight> result = FlightFinder.findFlightsTo("Athens");

        List<Flight> expectedResults = new ArrayList<>();
        expectedResults.add(new Flight("Alicante", "Athens"));
        expectedResults.add(new Flight("Tallinn", "Athens"));

        assertEquals(expectedResults.toString(), result.toString());
    }
}