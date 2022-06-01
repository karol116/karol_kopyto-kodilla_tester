package com.kodilla.mockito.execution_model.homework;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addOrder(new Order(212, LocalDate.of(2019, 2, 7), "yo123"));
        shop.addOrder(new Order(345, LocalDate.of(2020, 4, 3), "watermel0n"));
        shop.addOrder(new Order(256, LocalDate.of(2020, 12, 2), "21fsf"));
        shop.addOrder(new Order(423, LocalDate.of(2021, 2, 5), "tko"));
        shop.addOrder(new Order(198, LocalDate.of(2021, 3, 21), "dfsw"));
        shop.addOrder(new Order(209, LocalDate.of(2021, 8, 15), "yood3"));
        System.out.println(shop.getTwoYearsOrders(shop.orders.get(0).getDate()));
        System.out.println(shop.getTwoYearsOrders(LocalDate.of(2020,1,23)));
        System.out.println(shop.getNumberOfOrders());
        System.out.println(shop.getSumOfOrdersValue());
        System.out.println(shop.ordersFromMinimumToMaximumValue(300,400));
        System.out.println("--------------------------");
        System.out.println(shop.getOrders());
    }
}