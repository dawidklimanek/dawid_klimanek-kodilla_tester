package com.kodilla.collections.interfaces.homework;

public class BMW implements Car {
    private int speedIn;
    private int speedDe;

    private int speed;
    private int bmwRace;

    public BMW(int speed) {

        this.speed = speed;
        this.speedIn = speedIn;
        this.speedDe = speedDe;
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
        bmwRace= speedIn*3;

}
    public void printStates() {
        System.out.println("BMw speed: " + speed + "   Bmw Increase speed: "+ speedIn + "   BMW decrease speed:" + speedDe);
    }
}




