package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MacOSTest {
    @Test
    public void shouldSaveCorrectYearOfRelease(){
        MacOS macOS = new MacOS(2012);
        macOS.turnOn();
        macOS.turnOff();
        Assertions.assertEquals(2012, macOS.yearOfRelease);
    }

}