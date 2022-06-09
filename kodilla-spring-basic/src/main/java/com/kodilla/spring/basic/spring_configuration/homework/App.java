package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        Sedan fordMondeo = new Sedan();
        System.out.println(fordMondeo.hasHeadlightsTurnedOn(LocalTime.now()));
    }
}
