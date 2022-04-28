package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    private int sideA;
    private int sideB;
    private int sideC;
    private int height;

    public Triangle(int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public void surfaceArea() {
        double result = sideA * height / 2;
        System.out.println("The area of the triangle is: " + result);
    }

    @Override
    public void circumference() {
        double result = sideA + sideB + sideC;
        System.out.println("The circumference of the triangle is: " + result);
    }
}