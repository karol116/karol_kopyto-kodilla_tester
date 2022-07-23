package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewsagentTest {

    @Test
    public void returnSalary() {
        Job newsAgent = new Newsagent(4100, "selling goods");
        int salary = newsAgent.getSalary();
        Assertions.assertEquals(4100, salary);
    }
}