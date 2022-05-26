package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    List<Order> orders = new LinkedList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> twoYearsOrders(LocalDate dateFrom, LocalDate dateTo) {
        return orders
                .stream()
                .filter(u -> u.getDate().isAfter(dateFrom))
                .filter(u -> u.getDate().isBefore(dateTo))
                .collect(Collectors.toList());
    }
}
