package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public List<Order> addOrder(Order order) {
        orders.add(order);
        return orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Order getOrder(String number) throws Exception{
        Order foundOrder = getOrders()
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .findAny().orElseThrow(() -> new Exception("fail"));
        return foundOrder;
    }
}