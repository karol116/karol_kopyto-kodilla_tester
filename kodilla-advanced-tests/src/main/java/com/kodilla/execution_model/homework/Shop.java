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

    public List<Order> getOrders() {
        return orders;
    }

    public List<Order> twoYearsOrders(LocalDate dateFrom, LocalDate dateTo) {
        return orders
                .stream()
                .filter(u -> u.getDate().isAfter(dateFrom))
                .filter(u -> u.getDate().isBefore(dateTo))
                .collect(Collectors.toList());
    }

    public List<Order> ordersFromMinimumToMaximumValue(int minValue, int maxValue) {
        List<Order> ordersInTheValueRange = new LinkedList<>();
        for (Order order : orders) {
            int orderValue = order.getValue();
            if (minValue < orderValue && maxValue > orderValue) {
                ordersInTheValueRange.add(order);
            }
        }
        return ordersInTheValueRange;
    }

    public int getNumberOfOrders() {
        return this.orders.size();
    }

    public int getSumOfOrdersValue() {
        int sumOfValueOfOrder = 0;
        for (Order order : orders) {
            int valueOfOrder = order.getValue();
            sumOfValueOfOrder = sumOfValueOfOrder + valueOfOrder;
        }
        return sumOfValueOfOrder;
    }
}