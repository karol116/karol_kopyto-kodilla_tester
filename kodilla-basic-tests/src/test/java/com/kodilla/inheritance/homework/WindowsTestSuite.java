package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowsTestSuite {
    @Test
    public void shouldSaveCorrectYearOfRelease(){
        Windows windows = new Windows(1999);

        windows.turnOn();
        windows.displayYearOfRelease();
        windows.turnOff();

        Assertions.assertEquals(1999, windows.yearOfRelease);
    }
}