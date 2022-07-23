package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RhombusTest {
    @Test
    public void printCorrectResults() {
        Shape rhombus = new Rhombus(3, 4, 7);
        rhombus.surfaceArea();
        System.out.println("surface should be 21");
    }
}