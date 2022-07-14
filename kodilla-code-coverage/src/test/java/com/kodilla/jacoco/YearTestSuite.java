package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class YearTestSuite {


    @ParameterizedTest
    @ValueSource(ints = {1600,1992,1996})
    public void shouldReturnTrueIfYearIsLeap(int number) {

        //given
        Year year = new Year(number);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @ParameterizedTest
    @ValueSource(ints = {1700,2017,1900,2021,2022})
    public void shouldReturnFalseIfYearIsNotLeap(int number) {

        //given
        Year year = new Year(number);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }

}