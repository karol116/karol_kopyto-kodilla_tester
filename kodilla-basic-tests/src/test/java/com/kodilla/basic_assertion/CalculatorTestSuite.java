package com.kodilla.basic_assertion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    Calculator calculator;

   @BeforeEach
//    @BeforeAll
    public void setUp(){
        calculator = new Calculator();
    }


    @Test
    public void testSum() {
        int firstNumber = 5;
        int secondNumber = 8;
        int sumResult = calculator.sum(firstNumber, secondNumber);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        int firstNumber = 5;
        int secondNumber = 8;
        int subtractResult = calculator.subtract(firstNumber, secondNumber);
        assertEquals(3, subtractResult);
    }

    @Test
    public void testSquare() {
        double a = 5;
        double b = 0;
        double c = -5;

        double squareResultForNumberA = calculator.square(a);
        double squareResultForNumberB = calculator.square(b);
        double squareResultForNumberC = calculator.square(c);

        assertEquals(25, squareResultForNumberA, 0.1);
        assertEquals(0, squareResultForNumberB, 0.1);
        assertEquals(25, squareResultForNumberC, 0.1);


        //TODO zapis w pętli(?)
//        double[] squareResultFor = {calculator.square(a), calculator.square(b), calculator.square(c)};
//        int numberOfElements = squareResultFor.length;
//        for (int i = 0; i < numberOfElements; i++) {
//            assertEquals(25, squareResultFor[i], 0.1);
//        }
    }
}