package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    public void printCorrectResults() {
        Shape square = new Square(4);
        square.surfaceArea();
        System.out.println("surface should be 16");
    }
}