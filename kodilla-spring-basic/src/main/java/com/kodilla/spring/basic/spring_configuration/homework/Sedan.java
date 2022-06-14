package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Sedan implements Car {
    private LocalDateTime currentHour = TimeSetup.now();

    @Override
    public boolean hasHeadlightsTurnedOn() {
        int hour = currentHour.atZone(ZoneId.systemDefault()).getHour();
        return hour <= 6 || hour >= 20;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}