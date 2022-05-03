package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Subaru;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        int carsArrayLength = random.nextInt(15) + 1;
        Car cars[] = new Car[carsArrayLength];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        {
            Random random = new Random();
            int drawnCarMake = random.nextInt(3);
            int speed = random.nextInt(90) + 90;
            if (drawnCarMake == 0)
                return new Honda(speed);
            else if (drawnCarMake == 1)
                return new Subaru(speed);
            else
                return new Toyota(speed);
        }
    }
}