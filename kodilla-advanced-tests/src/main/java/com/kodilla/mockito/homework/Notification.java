package com.kodilla.mockito.homework;

public interface Notification {
    public default void addPerson(Person person){

    }

    public default void sendNotification(Notification notification){

    }
}
