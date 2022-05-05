package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("\n" + getCarMaker(car));
        System.out.println("Car speed after crossing the finish line: \n" + car.getSpeed() + " kilometres per hour");
    }

    private static String getCarMaker(Car car) {
        if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Subaru)
            return "Subaru";
        else if (car instanceof Honda)
            return "Honda";
        else
            return "Unknown car make";
    }
}