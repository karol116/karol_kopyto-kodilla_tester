package com.kodilla.spring.basic.spring_scopes;

import com.kodilla.depedency_injection.homework.Application;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskTestSuite {

    @Test
    public void shouldCreateDifferentTasks() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Task firstTask = context.getBean(Task.class);
        Task secondTask = context.getBean(Task.class);
        Task thirdTask = context.getBean(Task.class);
        Assertions.assertNotEquals(firstTask, secondTask);
        Assertions.assertNotEquals(secondTask, thirdTask);
        Assertions.assertNotEquals(firstTask, thirdTask);
    }
}