package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {
    @Test
    public void shouldReturnCorrectNumberOfLegs() {
        Duck duck = new Duck();
        duck.getNumberOfLegs();
        assertEquals(2, duck.getNumberOfLegs());
    }
}