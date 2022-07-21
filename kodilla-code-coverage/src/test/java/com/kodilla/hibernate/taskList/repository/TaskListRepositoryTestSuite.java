package com.kodilla.hibernate.taskList.repository;


import com.kodilla.hibernate.task.repository.TaskListRepository;
import com.kodilla.hibernate.taskList.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Do Hibernate Hibernate homework";

    @Test
    void testTaskRepositoryFindByDuration() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "Hibernate examples");

        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListRepository.findByListName(listName);

        //Then
        Assertions.assertEquals(1, readTaskLists.size());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListRepository.deleteById(id);
    }
}