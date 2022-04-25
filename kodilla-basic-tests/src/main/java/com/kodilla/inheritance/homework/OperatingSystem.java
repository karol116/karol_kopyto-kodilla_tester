package com.kodilla.inheritance.homework;

public class OperatingSystem {

    int yearOfRelease;

    public OperatingSystem(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void turnOn() {
        System.out.println("Opening operating system...");
    }

    public void turnOff() {
        System.out.println("Operating system is turned off");
        System.out.println();
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void displayYearOfRelease() {
        System.out.println("Year of release: " + yearOfRelease);
    }
}