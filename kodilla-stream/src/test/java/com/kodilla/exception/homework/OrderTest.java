package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void getCorrectOrderNumber(){
        Order order = new Order("34");
        String orderNumber = order.getNumber();
        assertEquals("34",orderNumber);
    }
}