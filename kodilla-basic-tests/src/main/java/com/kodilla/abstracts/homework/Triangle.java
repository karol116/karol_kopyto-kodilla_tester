package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle() {
        super(0, 0, 10, 8, 5, 4);
    }

    private int result;

    @Override
    public void surfaceArea() {
        result = (getSideA() * getHeight()) / 2;
        System.out.println("The area of the triangle is: " + result);
    }

    @Override
    public void circumference() {
        result = getSideA() + getSideB() + getSideC();
        System.out.println("The circumference of the triangle is: " + result);
    }
}