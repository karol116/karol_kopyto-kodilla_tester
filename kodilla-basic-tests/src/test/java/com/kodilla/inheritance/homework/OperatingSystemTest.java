package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatingSystemTest {
    @Test
    public void shouldSaveCorrectYearOfRelease() {
        OperatingSystem operatingSystem = new OperatingSystem(2002);

        operatingSystem.turnOn();
        operatingSystem.displayYearOfRelease();
        operatingSystem.turnOff();

        Assertions.assertEquals(2002, operatingSystem.yearOfRelease);
    }
}