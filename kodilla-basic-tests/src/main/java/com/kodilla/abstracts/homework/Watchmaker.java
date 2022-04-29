package com.kodilla.abstracts.homework;

public class Watchmaker extends Job {
    public Watchmaker(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void getResponsibilities() {
        System.out.println("repairing watches ");
    }
}