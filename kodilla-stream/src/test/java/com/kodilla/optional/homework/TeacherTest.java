package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    @Test
    public void isNameCorrect() {
        Teacher teacher = new Teacher("avr");

        String name = teacher.getName();
        teacher.toString();

        assertEquals("avr", name);
    }
}