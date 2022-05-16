package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task A", LocalDate.of(2022, 4, 28), LocalDate.of(2022, 5, 7)));
        tasks.add(new Task("Task B", LocalDate.of(2022, 4, 30), LocalDate.of(2022, 5, 4)));
        tasks.add(new Task("Task C", LocalDate.of(2022, 5, 4), LocalDate.of(2022, 5, 12)));
        tasks.add(new Task("Task D", LocalDate.of(2022, 5, 7), LocalDate.of(2022, 6, 3)));
        tasks.add(new Task("Task E", LocalDate.of(2022, 5, 15), LocalDate.of(2022, 6, 2)));
        tasks.add(new Task("Task F", LocalDate.of(2022, 6, 1), LocalDate.of(2022, 6, 17)));
        tasks.add(new Task("Task G", LocalDate.of(2022, 6, 8), LocalDate.of(2022, 6, 22)));
        return tasks;
    }
}
