package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void isNameCorrect() {
        Student student = new Student("avr", "smafd");

        String firstName = student.getFirstName();
        String lastName = student.getLastName();

        assertEquals("avr", firstName);
        assertEquals("smafd", lastName);
    }
}