package com.company;

public class Circle extends Shape {
    private double radius;
    public double getRadius() { return radius; }
    public Circle setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
