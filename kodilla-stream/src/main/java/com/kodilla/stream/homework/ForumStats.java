package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        System.out.println("Average number of posts written by a user aged 40+:\n- " + avgNumberOfYoungUsersPost());
        System.out.println("Average number of posts written by a user under 40:\n- " + avgNumberOfOldUsersPost());
    }

    private static double avgNumberOfOldUsersPost() {
        return UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    private static double avgNumberOfYoungUsersPost() {
        return UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }
}