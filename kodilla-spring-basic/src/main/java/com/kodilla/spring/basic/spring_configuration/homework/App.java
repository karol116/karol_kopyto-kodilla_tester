package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        Sedan fordMondeo = new Sedan();
        CarFactory carFactory = new CarFactory();
        System.out.println(carFactory.carChoice(LocalDate.of(1999,6,3)).getCarType());
        System.out.println(fordMondeo.hasHeadlightsTurnedOn(LocalTime.now()));
    }
}
