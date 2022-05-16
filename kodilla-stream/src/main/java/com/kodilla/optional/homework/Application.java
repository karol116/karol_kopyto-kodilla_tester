package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("John", new Teacher("Adam")));
        student.add(new Student("Olivia", new Teacher("Adam")));
        student.add(new Student("Joshua", null));
        student.add(new Student("Daniel", new Teacher("Emily")));
        student.add(new Student("Ethan", new Teacher("Adam")));
        student.add(new Student("John", null));
        student.add(new Student("Emma", new Teacher("Emily")));

        for (Student studentTeacher : student) {
            Optional<Teacher> teachers = Optional.ofNullable(studentTeacher.getTeacher());
            System.out.println("Uczeń: " + studentTeacher.getName() + ", nauczyciel: " + teachers.orElse(new Teacher("<undefined>")));
        }
    }
}