package com.kodilla.abstracts;

public class Triangular extends Shape {
private double h;
private double side;

    public Triangular(double side,double h) {
        this.side=side;
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
