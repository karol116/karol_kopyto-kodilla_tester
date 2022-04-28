package com.kodilla.abstracts.homework;

public class Rhombus extends Shape {

    private int sideA;
    private int sideB;
    private int height;

    public Rhombus(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void surfaceArea() {
        double result = sideA * height;
        System.out.println("The area of the rhombus is: " + result);
    }

    @Override
    public void circumference() {
        double result = 2 * sideA + 2 * sideB;
        System.out.println("The circumference of the rhombus is: " + result);
    }
}