package com.kodilla.abstracts;

import static java.lang.Math.PI;

public class Squer extends Shape implements com.kodilla.collections.interfaces.Shape {
private double side;

    public Squer(double side) {

        this.side=side;
    }

    @Override
    public double calcArea() {
        return 4*this.side;
    }

    @Override
    public double calcPerimetr() {
        return this.side*this.side;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
