package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
//        UserRepository.getUserList()
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
//                .forEach(un -> System.out.println(un));
                .collect(Collectors.toList());
                System.out.println(usernames);
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}