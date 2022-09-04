package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
private int speedIn;
private int speedDe;

private int speed;
public Ford(int speed) {

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

        @Override
        public void doRace(Car car) {

        }

        public void printStates() {
        System.out.println("Ford speed: " + speed + "   Ford Increase speed: "+ speedIn + "   Ford decrease speed:" + speedDe);
        }
        }




