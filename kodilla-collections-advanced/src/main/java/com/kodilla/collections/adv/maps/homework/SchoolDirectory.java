package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal Liam = new Principal("Liam", "Smith");
        Principal Mason = new Principal("Mason", "Johnson");
        Principal Jacob = new Principal("Jacob", "Wiliams");
        Principal William = new Principal("William", "Brown");

        School elementarySchool = new School(30, 40, 36, 22, 28, 35, 28);
        School middleSchool = new School(32, 42, 12, 32, 29, 34, 34, 33, 32, 23, 19);
        School highSchool = new School(30, 34, 43, 34, 35, 36, 36, 35, 35, 35, 38, 10, 40, 34, 24, 43, 32);
        School college = new School(165, 98, 43, 120, 120, 130, 100, 29, 33, 102, 120, 98, 65, 135, 76, 54, 34, 45, 54, 76);

        elementarySchool.setSchoolType("Elementary School");
        middleSchool.setSchoolType("Middle School");
        highSchool.setSchoolType("High School");
        college.setSchoolType("College");

        schools.put(Liam, elementarySchool);
        schools.put(Mason, middleSchool);
        schools.put(Jacob, highSchool);
        schools.put(William, college);

        for (Map.Entry<Principal, School> directorEntry : schools.entrySet())
            System.out.println("\n Director of " + directorEntry.getValue().schoolType + ": " + directorEntry.getKey().firstName
                    + "  " + directorEntry.getKey().lastName + ",\n  - number of students: " + directorEntry.getValue().allNumberOfStudents());
    }
}