package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Subaru;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListsApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Honda(100));
        cars.add(new Toyota(110));
        cars.add(new Subaru(90));
        cars.add(new Honda(95));

        Subaru subaru = new Subaru(100);
        cars.add(subaru);

        for (Car car : cars)
            CarUtils.describeCar(car);

        System.out.println("\n-----------------------------------------");

        cars.remove(3);
        cars.remove(subaru);
        cars.remove(new Honda(200));

        for (Car car : cars)
            CarUtils.describeCar(car);

        System.out.println("\nCars array size: "+cars.size());
    }
}