package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {

    public static void main(String[] args) {
        Random random =  new Random();
        int shapesArrayLength = random.nextInt(20)+1;
        Shape[] shapes = new Shape[shapesArrayLength];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = drawShape();
        }
        for (Shape shape : shapes)
            ShapeUtils.displayShapeInfo(shape);
    }

    private static Shape drawShape() {
        Random random = new Random();
        int drawnShapeKind = random.nextInt(3);
        double a = random.nextDouble() * 100 + 1;
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else
            return new Triangle(a, b, c);
    }
}