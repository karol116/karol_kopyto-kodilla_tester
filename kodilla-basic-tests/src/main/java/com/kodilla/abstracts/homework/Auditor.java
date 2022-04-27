package com.kodilla.abstracts.homework;

public class Auditor extends Job {
    public Auditor() {
        super(7600, "auditing of companies");
    }

    @Override
    public void getResponsibilities() {
        System.out.println("audit of companies");
    }
}