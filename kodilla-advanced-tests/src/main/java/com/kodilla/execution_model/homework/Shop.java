package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orderList = new HashSet<>();


    public void addOrder(Order order) {
        System.out.println(order);
        if (order.getWhoOrdered().equals("")) {
            order.setWhoOrdered("Anonymous");
        } else if (order.getValue() < 0.0 || order.getValue() == 0.0) {
            System.out.println("Wrong order format. Value cannot be 0.0 or negative");
            return;
        } else if (order.getOrderDate().isAfter(LocalDate.now())) {
            System.out.println("Wrong order format. Date can't be after today.");
            return;
        }
        orderList.add(order);
    }

    public List<Order> filterOrdersByDate(LocalDate startDate,LocalDate endDate) {
        return orderList
                .stream()
                .filter(u -> u.getOrderDate().isAfter(startDate))
                .filter((u->u.getOrderDate().isBefore((endDate))))
                .collect(Collectors.toList());

    }

    public List<Order> returnsMinAndMaksValueOfFilteredOrders(double min, double max) {
        return orderList
                .stream()
                .filter(u-> u.getValue()>min)
                .filter(u->u.getValue()<max)
                .collect(Collectors.toList());

    }

    public int getSize() {
        System.out.println("Order list size: " + orderList.size());
        return orderList.size();
    }

    public void clear() {
        System.out.println("Order list cleared!");
        orderList.clear();
    }

    public double sumOrders() {
        if (orderList.size() != 0) {

            double sum = 0;
            for (Order order : this.orderList) {
                sum += order.getValue();
            }
            System.out.println("Order value total:  " + sum);
            return sum;
        }
        System.out.println("No orders to sum up.");
        return 0;
    }
}
