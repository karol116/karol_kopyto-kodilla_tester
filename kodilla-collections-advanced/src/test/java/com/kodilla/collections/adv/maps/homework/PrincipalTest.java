package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {
    @Test
    public void isNameCorrect() {
        Principal teacher = new Principal("avr", "smafd");

        String firstName = teacher.firstName;
        String lastName = teacher.lastName;

        assertEquals("avr", firstName);
        assertEquals("smafd", lastName);
    }
}