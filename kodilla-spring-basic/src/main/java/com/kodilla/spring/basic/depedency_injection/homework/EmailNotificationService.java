package com.kodilla.spring.basic.depedency_injection.homework;

public class EmailNotificationService implements NotificationService{
    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address + ". Do not reply to this email.");
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address + ". Do not reply to this email.");
    }
}
