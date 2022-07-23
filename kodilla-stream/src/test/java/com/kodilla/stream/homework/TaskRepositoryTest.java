package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskRepositoryTest {

    @Test
    void test() {
        List<Task> taskRepository = TaskRepository.getTasks();
        int size = taskRepository.size();
        assertEquals(7,size);
    }
}