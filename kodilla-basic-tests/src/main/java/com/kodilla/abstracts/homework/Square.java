package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(11, 11, 8, 8, 8,8);
    }
    private int result;

    @Override
    public void surfaceArea() {
        result = (getSideA() * getSideA());
        System.out.println("The area of the square is: " + result);
    }

    @Override
    public void circumference() {
        result = (4 * getSideA());
        System.out.println("The circumference of the square is: " + result);
    }
}