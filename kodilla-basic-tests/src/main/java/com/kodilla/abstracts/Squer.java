package com.kodilla.abstracts;

import static java.lang.Math.PI;

public class Squer extends Shape{


    public Squer(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return 4*this.side;
    }

    @Override
    public double calcPerimetr() {
        return this.side*this.side;
    }
}
