package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Rhombus rhombus = new Rhombus();
        Square square = new Square();
        Triangle triangle = new Triangle();

        rhombus.surfaceArea();
        square.surfaceArea();
        triangle.surfaceArea();
        System.out.println();

        rhombus.circumference();
        square.circumference();
        triangle.circumference();

    }
}
