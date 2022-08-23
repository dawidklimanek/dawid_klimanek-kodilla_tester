package com.kodilla.abstracts;

public class Triangular extends Shape {
protected double h;

    public Triangular(double side,double h) {
        super(side);
        this.h=h;
    }

    @Override
    public double calcArea() {
        return 3*side;
    }

    @Override
    public double calcPerimetr() {
        return side*h/2;
    }
}
