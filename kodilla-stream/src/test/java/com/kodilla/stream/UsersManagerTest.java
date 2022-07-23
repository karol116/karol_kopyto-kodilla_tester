package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    @Test
    public void isNameCorrect() {
        String userName = UsersManager.getUserName(new User("afdsg", 93, 1002, "atf"));
        assertEquals("afdsg", userName);
    }
}