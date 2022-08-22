package com.kodilla.abstracts;

public class Triangular extends Shape {
protected double h;

    public Triangular(double r,double h) {
        super(r);
        this.h=h;
    }

    @Override
    public double calcArea() {
        return 3*r;
    }

    @Override
    public double calcPerimetr() {
        return r*h/2;
    }
}
