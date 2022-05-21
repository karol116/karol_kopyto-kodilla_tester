package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    String name;
    LocalDate opened;
    LocalDate deadline;

    public Task(String name, LocalDate opened, LocalDate deadline) {
        this.name = name;
        this.opened = opened;
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public LocalDate getOpened() {
        return opened;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Task task = (Task) o;
        return Objects.equals(name, task.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, opened, deadline);
    }
}
