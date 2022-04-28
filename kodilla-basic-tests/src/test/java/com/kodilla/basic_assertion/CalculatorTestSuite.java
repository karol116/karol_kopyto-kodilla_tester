package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int firstNumber = 5;
        int secondNumber = 8;
        int sumResult = calculator.sum(firstNumber, secondNumber);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int firstNumber = 5;
        int secondNumber = 8;
        int subtractResult = calculator.subtract(firstNumber, secondNumber);
        assertEquals(3, subtractResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 0;
        double c = -5;
        double[] squareResultFor = {calculator.square(a), calculator.square(b), calculator.square(c)};
        int numberOfElements = squareResultFor.length;

        for (int i = 0; i < numberOfElements; i++) {
            assertEquals(25, squareResultFor[i], 0.1);
        }
    }
}