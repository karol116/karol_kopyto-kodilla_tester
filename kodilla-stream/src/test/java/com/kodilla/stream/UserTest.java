package com.kodilla.stream;

import com.kodilla.stream.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = new User("bsf", 22, 2332, "a");
    }

    @Test
    void getName() {
        String userName = user.getUsername();
        assertEquals("bsf", userName);
    }

    @Test
    void getAge() {
        int age = user.getAge();

        assertEquals(22, age);
    }

    @Test
    void postNumber() {
        int postNumber = user.getNumberOfPost();

        assertEquals(2332, postNumber);
    }

    @Test
    void getGroup() {
        String groupNumber = user.getGroup();

        assertEquals("a", groupNumber);
    }

    @Test
    void equalsMethod(){
        assertTrue(user.equals(new User("bsf", 22, 2332, "a")));
    }

    @Test
    void hashCodeMethod(){
        int hashcode  = user.hashCode();
        assertNotNull(hashcode);
    }
}