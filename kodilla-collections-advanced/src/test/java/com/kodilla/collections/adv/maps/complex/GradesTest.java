package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradesTest {
    @Test
    void isAverageCorrect() {
        Grades grades = new Grades(2.0, 4.0, 3.5, 1.0, 1.0, 1.0, 4.5);
        double average = grades.getAverage();
        assertEquals(2.4285714285714284, average);
    }
}