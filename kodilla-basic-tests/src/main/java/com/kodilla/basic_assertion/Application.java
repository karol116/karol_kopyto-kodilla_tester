package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int firstNumber = 5;
        int secondNumber = 8;
        double a = 5;
        int sumResult = calculator.sum(firstNumber, secondNumber);
        int subtractResult = calculator.subtract(firstNumber, secondNumber);
        double squareResult = calculator.square(a);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + firstNumber + " i " + secondNumber);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + firstNumber + " i " + secondNumber);
        }

        correct = ResultChecker.assertEquals(3, subtractResult);
        if (correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + firstNumber + " i " + secondNumber);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + firstNumber + " i " + secondNumber);
        }

        correct = ResultChecker.assertEqualsForDouble(25, squareResult);
        if (correct) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }
    }
}