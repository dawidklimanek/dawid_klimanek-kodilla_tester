package com.kodilla.abstracts;

public class Round extends Shape {
    public double PI = 3.141527;

    public Round(double r) {
        super(r);
    }
@Override
    public double calcArea() {
        return PI * this.r * this.r;
    }

    @Override
    public double calcPerimetr() {
       return PI*2*this.r;
    }
}
