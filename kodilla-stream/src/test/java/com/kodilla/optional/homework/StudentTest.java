package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    public void isNameCorrect() {
        Teacher teacher = new Teacher("avr");
        Student student = new Student("werg",teacher);

        String name = student.getName();

        assertEquals("werg", name);
    }    @Test
    public void isStudentTeacherCorrect() {
        Teacher teacher = new Teacher("avr");
        Student student = new Student("werg",teacher);

        Teacher actualTeacher = student.getTeacher();

        assertEquals(teacher, actualTeacher);
    }
}