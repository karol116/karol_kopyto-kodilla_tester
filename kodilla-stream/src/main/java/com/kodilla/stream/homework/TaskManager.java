package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        System.out.println(TaskRepository.getTasks().get(5).getDeadline());
        if (TaskRepository.getTasks().get(5).getDeadline().isBefore(currentDate))
            System.out.println(TaskRepository.getTasks().get(1).getDeadline());
//        List<LocalDate> deadlines = TaskRepository.getTasks()
//                .stream()
//                .filter(u -> u.getDeadline().isBefore(currentDate));

    }
}
