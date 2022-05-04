package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        Shape square = new Square(4.0);
        shapes.add(square);
        shapes.add(new Triangle(2.0, 4.0, 10.77));
        shapes.add(new Circle(6.0));

        shapes.remove(2);                                   // [1]
        shapes.remove(square);                                    // [2]

//        Zamiast:
//        Triangle triangle = new Triangle(2.0, 4.0, 10.77);      //[3.1]
//        shapes.remove(triangle);
//        Bez zmiennej:

        shapes.remove(new Triangle(2.0, 4.0, 10.77));       // [3.2]

        System.out.println(shapes.size());
        for (Shape shape : shapes) {
            System.out.println("\n" + shape + "\n   Area: " + shape.getArea() + "\n   Perimeter: " + shape.getPerimeter());
        }
    }
}