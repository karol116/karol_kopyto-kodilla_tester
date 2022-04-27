package com.kodilla.abstracts.homework;

public class Watchmaker extends Job {
    public Watchmaker() {
        super(4200, "Repairing watches");
    }

    @Override
    public void getResponsibilities() {
        System.out.println("repairing watches ");
    }
}