package com.kodilla.spring.basic.dependence_injection.homework;

public class DeliveryStandard implements DeliveryService {
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
}
