package com.kodilla.collections.interfaces;

import java.awt.geom.PathIterator;

import static java.lang.Math.PI;

public class Circle extends com.kodilla.abstracts.Shape implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI*radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double calcArea() {
        return 0;
    }

    @Override
    public double calcPerimetr() {
        return 0;
    }
}
