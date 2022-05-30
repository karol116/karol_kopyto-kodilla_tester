package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine;
    Set<Integer> numbers;

    @BeforeEach
    public void setUp() {
        gamblingMachine = new GamblingMachine();
        numbers = new HashSet<>();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/validateNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnNumberOfWins(String input, int expected) {
        String[] inputNumbersA = input.split(",");
        Set<String> inputNumbersB = Stream.of(inputNumbersA).collect(Collectors.toSet());

        for (String s : inputNumbersB) {
            numbers.add(Integer.parseInt(s));
        }
        assertEquals(expected, numbers.size());
    }

    @RepeatedTest(100)
    @ParameterizedTest
    @CsvFileSource(resources = "/myNumbers.csv")
    public void checkWins(String input) throws InvalidNumbersException {
        String[] inputNumbersA = input.split(",");
        Set<String> inputNumbersB = Stream.of(inputNumbersA).collect(Collectors.toSet());

        for (String s : inputNumbersB) {
            numbers.add(Integer.parseInt(s));
        }

        int result = gamblingMachine.howManyWins(numbers);
        System.out.println("result " + result);
        assertTrue(result > 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/wrongUserNumbers.csv", numLinesToSkip = 1)
    public void shouldReturnTrueIfInvalidNumbersExceptionIsThrownWhenNumbersAreOutOfRangeFromZeroToFifty(String wrongNumbers) {
        boolean exceptionIsThrown = false;
        String[] wrongNumbersA = wrongNumbers.split(",");
        Set<String> wrongNumbersB = Stream.of(wrongNumbersA).collect(Collectors.toSet());

        for (String s : wrongNumbersB)
            numbers.add(Integer.parseInt(s));

        try {
            gamblingMachine.howManyWins(numbers);
        } catch (Exception exception) {
            exceptionIsThrown = true;
            assertTrue(exceptionIsThrown);
        }
        assertTrue(exceptionIsThrown);
    }
}