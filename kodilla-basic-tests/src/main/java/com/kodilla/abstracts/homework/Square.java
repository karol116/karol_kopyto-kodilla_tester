package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private int sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public void surfaceArea() {
        double result = Math.pow(sideA, 2);
        System.out.println("The area of the square is: " + result);
    }

    @Override
    public void circumference() {
        double result = 4 * sideA;
        System.out.println("The circumference of the square is: " + result);
    }
}