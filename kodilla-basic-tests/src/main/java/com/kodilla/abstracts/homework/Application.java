package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Rhombus rhombus = new Rhombus(8,4,3);
        Square square = new Square(2);
        Triangle triangle = new Triangle(4,6,13,8 );

        rhombus.surfaceArea();
        square.surfaceArea();
        triangle.surfaceArea();
        System.out.println();

        rhombus.circumference();
        square.circumference();
        triangle.circumference();

    }
}
