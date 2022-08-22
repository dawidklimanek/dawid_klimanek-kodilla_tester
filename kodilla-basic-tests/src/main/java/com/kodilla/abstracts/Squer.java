package com.kodilla.abstracts;

import static java.lang.Math.PI;

public class Squer extends Shape{


    public Squer(double r) {
        super(r);
    }

    @Override
    public double calcArea() {
        return 4*this.r;
    }

    @Override
    public double calcPerimetr() {
        return this.r*this.r;
    }
}
