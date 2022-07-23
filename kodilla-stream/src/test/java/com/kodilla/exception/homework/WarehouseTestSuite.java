package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void doesOrderExist_withException() {
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("0101"));
    }

    @Test
    public void isOrderAdded() {
        Warehouse warehouse = new Warehouse();
        List<Order> orderList = warehouse.addOrder(new Order("2"));
        int listSize = orderList.size();
        assertEquals(1, listSize);
    }
}