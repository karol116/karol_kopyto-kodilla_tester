package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuditorTest {
    @Test
    public void returnSalary() {
        Job auditor = new Auditor(8100, "selling goods");
        int salary = auditor.getSalary();
        Assertions.assertEquals(8100, salary);
    }
}