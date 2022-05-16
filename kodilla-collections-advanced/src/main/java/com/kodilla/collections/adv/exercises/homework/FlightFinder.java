package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public static List<Flight> findFlightsFrom(String arrival) {
        List<Flight> result = new ArrayList<>();
        result.clear();
        for (int i = 0; i < FlightRepository.getFlightsTable().size(); i++) {
            if (FlightRepository.getFlightsTable().get(i).getArrival().contains(arrival))
                result.add(FlightRepository.getFlightsTable().get(i));
        }
        return result;
    }

    public static List<Flight> findFlightsTo(String departure) {
        List<Flight> result = new ArrayList<>();
        for (int i = 0; i < FlightRepository.getFlightsTable().size(); i++) {
            if (FlightRepository.getFlightsTable().get(i).getDeparture().contains(departure))
                result.add(FlightRepository.getFlightsTable().get(i));
        }
        return result;
    }
}