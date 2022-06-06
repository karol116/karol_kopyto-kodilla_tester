package com.kodilla.spring.basic.depedency_injection.homework;

public interface NotificationService {

    public void success(String address);

    public void fail(String address);
}