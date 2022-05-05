package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    String schoolType;

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    private List<Integer> numberOfStudents = new ArrayList<>();
    public School(int... numberOfStudents) {
        for (int classroom: numberOfStudents)
            this.numberOfStudents.add(classroom);
    }
    public int allNumberOfStudents(){
        int sum = 0;
        for(int numberOfStudents : numberOfStudents)
            sum += numberOfStudents;
            return sum;
    }
}