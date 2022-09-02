package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        BMW bmw = new BMW(10);
        bmw.getSpeed();
        bmw.increaseSpeed(20);
        bmw.decreaseSpeed(2);
        System.out.println();
        bmw.printStates();

        Ford ford= new Ford(10);
        ford.getSpeed();
        ford.increaseSpeed(30);
        ford.decreaseSpeed(2);
        System.out.println();
        ford.printStates();

        Opel opel = new Opel(10);
        opel.getSpeed();
        opel.increaseSpeed(60);
        opel.decreaseSpeed(5);
        System.out.println();
        opel.printStates();

    }
}
