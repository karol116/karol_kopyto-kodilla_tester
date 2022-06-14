package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Configuration
public class CarFactory {
    private LocalDateTime currentData = TimeSetup.now();

    @Bean
    public Sedan createSedan() {
        return new Sedan();
    }

    @Bean
    public Car carChoice() {
        Car car;
        int month = currentData.atZone(ZoneId.systemDefault()).getMonth().getValue();
        int dayOfMonth = currentData.atZone(ZoneId.systemDefault()).getDayOfMonth();
        if ((month >= 3 && month <= 5) || (month >= 9 && month <= 11)) {
            return car = new Sedan();
        } else if (month >= 6 && month <= 8) {
            return car = new Coupe();
        } else if ((dayOfMonth >= 1 && dayOfMonth <= 31 && month == 12) || month <= 2) {
            return car = new Compact();
        } else return null;
    }
}