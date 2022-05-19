package com.kodilla.exception.homework;

public class WareHouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("0001"));
        warehouse.addOrder(new Order("0002"));
        warehouse.addOrder(new Order("0003"));
        warehouse.addOrder(new Order("0004"));
        warehouse.addOrder(new Order("0005"));
        warehouse.addOrder(new Order("0006"));

        try {
            warehouse.getOrder("00030");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesn't exist");
        }
    }
}