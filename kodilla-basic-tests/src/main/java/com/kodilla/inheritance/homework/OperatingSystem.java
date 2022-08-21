package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int yearOfPublish;

    public OperatingSystem(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public void turnOn() {
        System.out.println("System turned On...");
    }

    public void turnOff() {
        System.out.println("System turned Off...");
    }
    public int getYearOfPublish(){
        return yearOfPublish;
    }
    public void displayYearOfPublish() {
        System.out.println("Year of publish: " + yearOfPublish);
    }
}
