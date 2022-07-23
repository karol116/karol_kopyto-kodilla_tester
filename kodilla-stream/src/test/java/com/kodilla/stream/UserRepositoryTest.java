package com.kodilla.stream;

import com.kodilla.stream.homework.Task;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    @Test
    void test() {
        List<User> userRepository = UserRepository.getUserList();
        int size = userRepository.size();
        assertEquals(6, size);
    }

    @Test
    void getCorrectAverageAge() {
        double avg = UserRepository.getUserList()
                .stream()
                .mapToInt(n -> n.getAge())
                .average()
                .getAsDouble();
        System.out.println(avg);

        assertEquals(43.166666666666664, avg);
    }
}

