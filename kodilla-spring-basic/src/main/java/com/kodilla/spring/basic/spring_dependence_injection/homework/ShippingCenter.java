package com.kodilla.spring.basic.spring_dependence_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {

    DeliveryServiceEurope deliveryService;
    NotificationServiceEurope notificationService;

    public ShippingCenter(DeliveryServiceEurope deliveryService, NotificationServiceEurope notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}
