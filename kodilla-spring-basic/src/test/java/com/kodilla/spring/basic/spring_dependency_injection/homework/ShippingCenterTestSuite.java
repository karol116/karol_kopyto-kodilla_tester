package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {
    ApplicationContext context;

    @BeforeEach
    public void SetUpAll() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    }

    @Test
    public void shouldReturnTrueIfShipmentIfWeightIsCorrect() {
        DeliveryService beanA = context.getBean(DeliveryService.class);
        Boolean isDelivered = beanA.deliverPackage("Compton", 29);
        Assertions.assertEquals(true, isDelivered);
    }

    @Test
    public void shouldReturnFalseIfShipmentIfWeightIsNotCorrect() {
        DeliveryService beanB = context.getBean(DeliveryService.class);
        Boolean isDelivered = beanB.deliverPackage("Chinatown", 30.01);
        Assertions.assertEquals(false, isDelivered);
    }

    @Test
    public void shouldReturnCorrectFailDeliveryNotification() {
        NotificationService beanC = context.getBean(NotificationService.class);
        String message = beanC.fail("Crenshaw");
        Assertions.assertEquals("Package not delivered to: Crenshaw", message);
    }

    @Test
    public void shouldReturnCorrectSuccessDeliveryNotification() {
        NotificationService beanD = context.getBean(NotificationService.class);
        String message = beanD.fail("Santa Fe");
        Assertions.assertEquals("Package not delivered to: Santa Fe", message);
    }
}