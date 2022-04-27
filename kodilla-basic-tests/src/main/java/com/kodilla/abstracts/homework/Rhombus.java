package com.kodilla.abstracts.homework;

public class Rhombus extends Shape {

    private int result;

    public Rhombus() {
        super(2, 4, 8, 4, 4, 10);
    }

    @Override
    public void surfaceArea() {
        result = (getFirstDiagonal() * getSecondDiagonal()) / 2;
        System.out.println("The area of the rhombus is: " + result);
    }

    @Override
    public void circumference() {
        result = (2 * getSideA()) + (2 * getSideB());
        System.out.println("The circumference of the rhombus is: " + result);
    }
}