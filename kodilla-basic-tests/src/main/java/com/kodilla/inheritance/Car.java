package com.kodilla.inheritance;

public class Car {
    private int wheels;
    public  int seats;

    public void turnOnLights(){
        System.out.println("Lights were turned on");
    }
    private void openDoors() {
        System.out.println("Opening 4 doors");
    }
         public Car(){
        System.out.println("Car constructor");
   }
}
