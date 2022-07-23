package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void shouldReturnCorrectNumberOfLegs() {
        Animal dog = new Dog();
        dog.getNumberOfLegs();
        assertEquals(4, dog.getNumberOfLegs());
    }

}