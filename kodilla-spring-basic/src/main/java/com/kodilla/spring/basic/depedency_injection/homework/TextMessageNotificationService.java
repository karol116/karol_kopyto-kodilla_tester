package com.kodilla.spring.basic.depedency_injection.homework;

public class TextMessageNotificationService implements NotificationService{

    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address + ". Do not reply to this message.");
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address + ". Do not reply to this message.");
    }
}
