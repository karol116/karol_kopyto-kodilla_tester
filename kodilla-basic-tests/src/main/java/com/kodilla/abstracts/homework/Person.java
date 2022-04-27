package com.kodilla.abstracts.homework;

public class Person {
    public String firstName;
    public int age;
    public Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {

        Job watchmaker = new Watchmaker();
        Job auditor = new Auditor();
        Job newsagent = new Newsagent();

        Person marek = new Person("Marek", 32, newsagent);
        Person agata = new Person("Agata", 34, auditor);
        Person andrzej = new Person("Andrzej", 63, watchmaker);

        System.out.print(andrzej.firstName + " is responsible for ");
        andrzej.job.getResponsibilities();

        System.out.print(agata.firstName + " is responsible for ");
        agata.job.getResponsibilities();

        System.out.print(marek.firstName + " is responsible for ");
        marek.job.getResponsibilities();
    }
}