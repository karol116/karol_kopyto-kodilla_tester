package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ShopTestSuite {
    Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
        shop.addOrder(new Order(212, LocalDate.of(2019, 2, 7), "yo123"));
        shop.addOrder(new Order(345, LocalDate.of(2020, 4, 3), "watermel0n"));
        shop.addOrder(new Order(256, LocalDate.of(2020, 12, 2), "21fsf"));
        shop.addOrder(new Order(423, LocalDate.of(2021, 2, 5), "tko"));
        shop.addOrder(new Order(198, LocalDate.of(2021, 3, 21), "dfsw"));
        shop.addOrder(new Order(209, LocalDate.of(2021, 8, 15), "yood3"));
        shop.addOrder(new Order(202, LocalDate.of(2024, 3, 16), "yo4od3"));
    }

    @Test
    public void shouldReturnListOfOrdersFromTwoYearsFromGivenDate() {
        List<Order> twoYearsOrders = new LinkedList<>();
        twoYearsOrders.add(new Order(256, LocalDate.of(2020, 12, 2), "21fsf"));
        twoYearsOrders.add(new Order(423, LocalDate.of(2021, 2, 5), "tko"));
        twoYearsOrders.add(new Order(198, LocalDate.of(2021, 3, 21), "dfsw"));
        twoYearsOrders.add(new Order(209, LocalDate.of(2021, 8, 15), "yood3"));
        assertEquals(twoYearsOrders.toString(), shop.getTwoYearsOrders(LocalDate.of(2020, 12, 1)).toString());
    }

    @Test
    public void returnCorrectNumberOfOrders() {
        assertEquals(7, shop.getNumberOfOrders());
    }

    @Test
    public void isOrderAddedToList() {
       shop.orders.clear();
       shop.addOrder(new Order(0,LocalDate.of(2000,2,1),"test12"));
        assertEquals(1, shop.getNumberOfOrders());
    }

    @Test
    public void getListOfOrderFromGivenRangeFromMinToMaxValue() {
        List<Order> expectedOrders = new LinkedList<>();
        expectedOrders.add(new Order(345, LocalDate.of(2020, 4, 3), "watermel0n"));
        expectedOrders.add(new Order(256, LocalDate.of(2020, 12, 2), "21fsf"));
        assertEquals(expectedOrders.toString(), shop.ordersFromMinimumToMaximumValue(255, 399).toString());
    }

    @Test
    public void returnSumOfValueOfAddedOrders() {
        assertEquals(1845,shop.getSumOfOrdersValue());
    }
}