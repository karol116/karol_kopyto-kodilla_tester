package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.TemporalAccessor;

@Configuration
public class CarFactory {

    @Bean
    public Sedan createSedan() {
        return new Sedan();
    }

    @Bean
    public Car carChoice(LocalDate date) {
        Car car;

        for (int i = 1999; i < 2030; i++) {
            if (date.isAfter(LocalDate.of(i -1, 10, 31)) && date.isBefore(LocalDate.of(i, 6, 1))) {
                return car = new Sedan();
            } else if (date.isAfter(LocalDate.of(i, 5, 31)) && date.isBefore(LocalDate.of(i, 9, 1))) {
                return car = new Coupe();
            } else if (date.isAfter(LocalDate.of(i, 8, 31)) && date.isBefore(LocalDate.of(i, 12, 1))) {
                return car = new Compact();
            }
        }
        return null;
    }
}