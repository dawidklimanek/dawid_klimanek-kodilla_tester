package com.kodilla.collections.interfaces.homework;

public abstract class Car {
    private int speed;
    public Car(int speed){
        this.speed=speed;

    }

    public void increaseSpeed (int differenceInc) {
        this.speed += differenceInc;

    }

    public void decreaseSpeed (int differenceDec) {
        this.speed -= differenceDec;
    }


    public void brake() {

    }


    public int getSpeed () {
        return this.speed;
    }
}
