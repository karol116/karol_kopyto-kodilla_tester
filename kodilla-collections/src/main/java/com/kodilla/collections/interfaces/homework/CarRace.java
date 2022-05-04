package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car carA = new Toyota(120);
        Car carB = new Subaru(110);
        Car carC = new Honda(105);

        carA.increaseSpeed();
        doRace(carA);
        doRace(carB);
        doRace(carC);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}