package com.kodilla.collections.interfaces.homework;

public class Honda implements Car {
    private int speed;

    public Honda(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = getSpeed() + 40;
    }

    @Override
    public void decreaseSpeed() {
        speed = getSpeed() - 50;
    }
}