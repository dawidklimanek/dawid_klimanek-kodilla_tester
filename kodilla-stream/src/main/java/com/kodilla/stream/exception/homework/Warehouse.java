package com.kodilla.stream.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    private Set<Order>orders = new HashSet<>();

    public void addOrder(Order order){
        orders.add(order);
    }
    public Order getOrder(String number) throws OrderDoesntExistException{
       return orders
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .findFirst()
                .orElseThrow(() -> new OrderDoesntExistException("Order" + number + "does not exist "));
    }
}
