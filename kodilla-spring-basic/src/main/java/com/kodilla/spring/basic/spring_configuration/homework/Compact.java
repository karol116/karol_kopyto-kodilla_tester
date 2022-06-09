package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Compact implements Car {
    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {
        return (time.isAfter(LocalTime.parse("20:00")) || time.isBefore(LocalTime.parse("06:00")));
    }

    @Override
    public String getCarType() {
        return "Compact";
    }
}