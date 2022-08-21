package com.kodilla.inheritance.homework;

public class AppliSys {
    public static void main(String[] args) {
        OperatingSystem operatingSystem= new OperatingSystem(1998);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        Convsystem convsystem=new Convsystem(1995);
        convsystem.displayYearOfPublish();
    }
}
