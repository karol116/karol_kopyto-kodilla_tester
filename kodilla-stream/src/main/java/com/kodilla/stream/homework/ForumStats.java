package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgNumberOfOldUsersPosts = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        double avgNumberOfYoungUsersPosts = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();

        System.out.println("Average number of posts written by a user under 40:\n- " + avgNumberOfOldUsersPosts);
        System.out.println("Average number of posts written by a user aged 40+:\n- " + avgNumberOfYoungUsersPosts);
    }
}