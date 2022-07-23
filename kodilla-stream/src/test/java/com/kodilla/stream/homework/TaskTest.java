package com.kodilla.stream.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    Task task;

    @BeforeEach
    void setUp(){
        task = new Task("Task A", LocalDate.of(2022, 4, 28), LocalDate.of(2022, 5, 7));
    }

    @Test
    void getName() {
        String taskName = task.getName();
        assertEquals("Task A",taskName);
    }

    @Test
    void getDeadline(){
        LocalDate localDate = task.getDeadline();
        LocalDate expectedDate = LocalDate.of(2022, 5, 7);

        assertEquals(expectedDate,localDate);
    }

    @Test
    void getOpened(){
        LocalDate localDate = task.getOpened();
        LocalDate expectedDate = LocalDate.of(2022, 4, 28);

        assertEquals(expectedDate,localDate);
    }
    @Test
    void hashCodeMethod(){
        int hashcode  = task.hashCode();
        assertNotNull(hashcode);
    }
}