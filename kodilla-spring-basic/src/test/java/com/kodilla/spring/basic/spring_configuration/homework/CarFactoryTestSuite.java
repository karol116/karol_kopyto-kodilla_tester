package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CarFactoryTestSuite {
    ApplicationContext context;

    @BeforeEach
    public void SetUpAll() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    }

    @Test
    public void testSedanCreated() {
        Coupe coupe = context.getBean(Coupe.class);
        Assertions.assertEquals("Coupe", coupe.getCarType());
    }

    @Test
    public void carShouldHaveItsLightsSwitchedOffIfItIsAfterEightPMAndBeforeSixAMNow() {
        Compact compact = context.getBean(Compact.class);
        boolean lightsOn = compact.hasHeadlightsTurnedOn();
        Assertions.assertEquals("Compact", compact.getCarType());
        Assertions.assertFalse(lightsOn);
    }

    @Test
    public void shouldReturnCoupeIfItIsSummerNow() {
        CarFactory carFactory = context.getBean(CarFactory.class);
        Coupe coupe = context.getBean(Coupe.class);
        Assertions.assertEquals(coupe, carFactory.carChoice());
    }
}