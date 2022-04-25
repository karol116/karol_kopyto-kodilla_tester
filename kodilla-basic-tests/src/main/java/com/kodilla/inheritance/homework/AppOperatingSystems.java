package com.kodilla.inheritance.homework;

public class AppOperatingSystems {
    public static void main(String[] args) {

        OperatingSystem system = new OperatingSystem(1954);
        system.turnOn();
        system.displayYearOfRelease();
        system.turnOff();

        Windows windows = new Windows(1985);
        windows.turnOn();
        windows.displayYearOfRelease();
        windows.turnOff();

        MacOS macOS = new MacOS(1999);
        macOS.turnOn();
        macOS.displayYearOfRelease();
        macOS.turnOff();
    }
}