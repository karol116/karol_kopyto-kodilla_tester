package com.kodilla.spring.basic.depedency_injection;

public class SkypeMessageService implements MessageService {

    @Override
    public void send(String message, String receiver) {
        System.out.println("Sending message [" + message + "] to: " + receiver + "using Skype");
    }
}