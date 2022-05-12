package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public static List<Flight> findFlightsFrom(String arrival) {
        List <Flight> result = new ArrayList<>();
        for (int i = 0; i < FlightRepository.getFlightsListSize(); i++) {
            if (FlightRepository.getFlightsTable().contains(arrival))
                result.add(FlightRepository.getFlightsTable().get(i));
        }
        return result;
    }


//    public Flight findFlightsTo(String departure) {
//        for (int i = 0; i < FlightRepository.getFlightsListSize(); i++)
//            if (FlightRepository.getFlightsTable().contains(departure))
//                return FlightRepository.getFlightsTable().get(i);
//
//        return null;
//    }
}