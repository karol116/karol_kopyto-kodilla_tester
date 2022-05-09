package com.kodilla.collections.adv.immutable.homework;

public class TaskApp {
    public static void main(String[] args) {
        Task taskA = new Task("Exercise A", 2);
//        Task taskB = new TaskHacked("Exercise B", 3);

        System.out.println("Time to do " + taskA.getTitle() + ": " + taskA.getDuration() + " hours");
//        taskA = taskB;
//        System.out.println("Time to do " + taskA.getTitle() + ": " + taskA.getDuration() + " hours");
    }
}