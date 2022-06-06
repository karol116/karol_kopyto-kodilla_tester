package com.kodilla.spring.basic.depedency_injection;

public class SimpleApplicationRunner {
    public static void main(String[] args) {
        MessageService messageService = new FacebookMessageService();
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("test message", "receiver@gmail.com");
    }
}
