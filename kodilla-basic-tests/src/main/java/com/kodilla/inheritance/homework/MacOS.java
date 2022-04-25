package com.kodilla.inheritance.homework;

public class MacOS extends OperatingSystem {

    public MacOS(int yearOfRelease) {
        super(yearOfRelease);
    }

    @Override
    public void turnOn() {
        System.out.println("Opening MacOS operating system...");
    }

    @Override
    public void turnOff() {
        System.out.println("MacOS operating system is turned off");
        System.out.println();
    }
}