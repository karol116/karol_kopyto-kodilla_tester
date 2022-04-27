package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int firstDiagonal;
    private int secondDiagonal;
    private int sideA;
    private int sideB;
    private int sideC;
    private int height;


    public Shape(int firstDiagonal, int secondDiagonal, int sideA, int sideB, int sideC, int height) {
        this.firstDiagonal = firstDiagonal;
        this.secondDiagonal = secondDiagonal;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public int getFirstDiagonal() {
        return firstDiagonal;
    }

    public int getSecondDiagonal() {
        return secondDiagonal;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getHeight() {
        return height;
    }

    public int getSideC() {
        return sideC;
    }

    public abstract void surfaceArea();

    public abstract void circumference();
}
