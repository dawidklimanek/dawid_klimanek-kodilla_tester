package com.kodilla.spring.basic.dependence_injection.homework;

public class NotificationPriority implements NotificationService {
    public void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}
