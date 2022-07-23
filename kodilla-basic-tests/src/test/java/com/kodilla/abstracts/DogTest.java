package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    @Test
    public void shouldReturnCorrectNumberOfLegs() {
        Dog dog = new Dog();
        dog.getNumberOfLegs();
        assertEquals(4, dog.getNumberOfLegs());
    }

}