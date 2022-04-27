package com.kodilla.abstracts.homework;

public class Newsagent extends Job {
    public Newsagent() {
        super(3700, "Selling newspapers");
    }

    @Override
    public void getResponsibilities() {
        System.out.println("selling newspapers");
    }
}