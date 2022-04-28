package com.kodilla.abstracts.homework;

public class Auditor extends Job {
    public Auditor(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void getResponsibilities() {
        System.out.println("audit of companies");
    }
}