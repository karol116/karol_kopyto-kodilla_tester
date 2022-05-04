package com.kodilla.collections.interfaces.homework;

public class Subaru implements Car {
    private int speed;

    public Subaru(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = getSpeed() + 35;
    }

    @Override
    public void decreaseSpeed() {
        speed = getSpeed() - 45;
    }

    @Override
    public String toString() {
        return "Subaru{" +
                "speed=" + speed +
                '}';
    }
}