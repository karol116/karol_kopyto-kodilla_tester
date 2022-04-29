package com.kodilla.abstracts.homework;

public class Newsagent extends Job {

    public Newsagent(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void getResponsibilities() {
        System.out.println("selling newspapers");
    }
}