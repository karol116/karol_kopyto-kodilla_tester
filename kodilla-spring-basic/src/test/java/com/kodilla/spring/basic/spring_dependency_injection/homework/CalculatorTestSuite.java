package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {
    ApplicationContext context;
    Calculator bean;

    @BeforeEach
    public void setUp() {
        context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        bean = context.getBean(Calculator.class);
    }

    @Test
    public void shouldReturnCorrectResultForAddition() {
        double result = bean.add(2, -3.33);
        Assertions.assertEquals(-1.33, result, 0.001);
    }

    @Test
    public void shouldReturnCorrectResultForSubtraction() {
        double result = bean.subtract(8.7, 7.1);
        Assertions.assertEquals(1.6, result, 0.001);
    }

    @Test
    public void shouldReturnCorrectResultForMultiplication() {
        double result = bean.multiply(8.12, -3);
        Assertions.assertEquals(-24.36, result, 0.001);
    }

    @Test
    public void shouldReturnCorrectResultForDividing() {
        double result = bean.divide(32.665, 6.95);
        Assertions.assertEquals(4.7, result, 0.001);
    }
}