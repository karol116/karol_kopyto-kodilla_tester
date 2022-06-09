package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
class CarFactoryTestSuite {
    @Test
    public void testSedanCreated() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Sedan sedan = context.getBean(Sedan.class);
        //When
        boolean lightsOn = sedan.hasHeadlightsTurnedOn(LocalTime.parse("20:01"));
        boolean lightsOff = sedan.hasHeadlightsTurnedOn(LocalTime.parse("6:01"));
        String getCarType = sedan.getCarType();
        //Then
        Assertions.assertEquals(true, lightsOn);
        Assertions.assertEquals(false, lightsOff);
        Assertions.assertEquals("Sedan", getCarType);
    }
}