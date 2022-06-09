package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Scope("prototype")
public class Clock {

    public Clock() {
        ZonedDateTime time = ZonedDateTime.now();
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
    }
}