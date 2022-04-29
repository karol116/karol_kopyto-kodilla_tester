package com.kodilla.school;

public class App {
    public static void main(String[] args) {
        String name = "marek";
        Student marek = new Student(name);
        Grades grades = new Grades();

        marek.addPhysicsGrade(4);
        marek.addPhysicsGrade(3);
        marek.addPhysicsGrade(2);
        marek.addPhysicsGrade(4);
        marek.addPhysicsGrade(3);
        marek.addPhysicsGrade(4);

        System.out.println(marek.getPhysicsAverage());
    }
}