package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void AddFlight(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Charleroi", "Bergamo"));
        flights.add(new Flight("Birmingham", "Dublin"));
        flights.add(new Flight("Tallinn", "Charleroi"));

        assertEquals(3,flights.size());
    }

    @Test
    public void testFindFlightFrom(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Charleroi", "Bergamo"));
        flights.add(new Flight("Alicante", "Athens"));
        flights.add(new Flight("Birmingham", "Dublin"));
        flights.add(new Flight("Bergamo", "Hamburg"));
        flights.add(new Flight("Tallinn", "Charleroi"));

        List<Flight> result = FlightFinder.findFlightsFrom("Bergamo");

        List<Flight> expectedResults = new ArrayList<>();
        expectedResults.add(new Flight("Charleroi", "Bergamo"));
        expectedResults.add(new Flight("Bergamo", "Hamburg"));
        assertEquals(expectedResults,result);


    }

    @Test
    public void testFindFlightTo(){

    }


}