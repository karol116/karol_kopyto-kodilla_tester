package com.kodilla.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertibleTest {
    @Test
    public void returnCorrectNumberOfWheels(){
        Convertible car = new Convertible(4,5);
        car.turnOnLights();
        Assertions.assertEquals(4, car.getWheels());
    }
    @Test
    public void returnCorrectNumberOfSeats(){
        Convertible car = new Convertible(4,7);
        car.openDoors();
        car.displayNumberOfSeats();
        Assertions.assertEquals(7, car.getSeats());
    }
}