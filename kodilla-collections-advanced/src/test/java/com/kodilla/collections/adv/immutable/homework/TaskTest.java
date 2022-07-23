package com.kodilla.collections.adv.immutable.homework;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void returnCorrectTitle() {
        Task task = new Task("title123", 20);
        String title = task.getTitle();
        assertEquals("title123",title);
    }

    @Test
    void returnCorrectDuration() {
        Task task = new Task("title1234", 20);
        int duration = task.getDuration();
        assertEquals(20,duration);
    }
}