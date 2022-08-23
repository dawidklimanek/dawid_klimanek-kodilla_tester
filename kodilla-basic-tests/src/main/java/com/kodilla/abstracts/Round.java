package com.kodilla.abstracts;

public class Round extends Shape {
    public double PI = 3.141527;
private  double side;

    public Round(double side) {
        this.side=side;
    }
@Override
    public double calcArea() {
        return PI * this.side * this.side;
    }

    @Override
    public double calcPerimetr() {
       return PI*2*this.side;
    }
}
