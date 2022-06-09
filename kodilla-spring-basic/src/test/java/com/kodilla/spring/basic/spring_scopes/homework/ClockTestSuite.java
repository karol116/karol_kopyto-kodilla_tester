package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTestSuite {
    @Test
    public void shouldReturnCurrentTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clockA = context.getBean(Clock.class);
        Clock clockB = context.getBean(Clock.class);
        Clock clockC = context.getBean(Clock.class);
        Assertions.assertNotEquals(clockA, clockC);
        Assertions.assertNotEquals(clockB, clockA);
        Assertions.assertNotEquals(clockC, clockB);
    }
}