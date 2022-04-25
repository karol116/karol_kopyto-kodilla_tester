package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int yearOfRelease) {
        super(yearOfRelease);
    }

    @Override
    public void turnOn() {
        System.out.println("Opening Windows operating system...");
    }

    @Override
    public void turnOff() {
        System.out.println("Windows operating system is turned off");
        System.out.println();
    }
}