package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Year;

@Configuration
public class CarFactory {

    @Bean
    public Sedan createSedan() {
        return new Sedan();
    }

    @Bean
    public Car carChoice(LocalDate date) {
        Car car;
        if (date.isAfter(LocalDate.of(Year.from(Year.of(1990)).compareTo(Year.of(2030)), 3, 1))
                && date.isBefore(LocalDate.of(Year.from(Year.of(1990)).compareTo(Year.of(2030)), 5, 31))) {
            return car = new Sedan();
        } else if ((date.isAfter(LocalDate.of(Year.from(Year.of(1990)).compareTo(Year.of(2030)), 6, 1))
                && date.isBefore(LocalDate.of(Year.from(Year.of(1990)).compareTo(Year.of(2030)), 8, 31)))) {
            return car = new Coupe();
        } else if ((date.isAfter(LocalDate.of(Year.from(Year.of(1990)).compareTo(Year.of(2030)), 9, 1))
                && date.isBefore(LocalDate.of(Year.from(Year.of(1990)).compareTo(Year.of(2030)), 11, 30)))) {
            return car = new Compact();
        } else {
            return car = new Sedan();
        }
    }
}