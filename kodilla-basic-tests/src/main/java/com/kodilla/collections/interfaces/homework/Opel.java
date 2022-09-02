package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

private int speedIn;
private int speedDe;

private int speed;
public Opel(int speed) {

        this.speed = speed;
        this.speedIn=speedIn;
        }


@Override
public int getSpeed() {
        return speed;
        }

@Override
public void increaseSpeed(int increase) {
        speedIn = speed + increase;
        }

@Override
public void decreaseSpeed(int decrease) {
        speedDe = speed - decrease;
        }
public void printStates() {
        System.out.println("Opel speed: " + speed + "   Opel Increase speed: "+ speedIn + "   Opel decrease speed:" + speedDe);
        }
        }




