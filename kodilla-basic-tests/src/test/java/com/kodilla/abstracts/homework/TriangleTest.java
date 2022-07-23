package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    public void printCorrectResults() {
        Shape triangle = new Triangle(6, 4, 7, 4);
        triangle.circumference();
        System.out.println("circumference should be 17");
    }
}