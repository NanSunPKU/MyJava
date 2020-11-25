package com.company;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        length=1;
        breadth=1;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(double s) {
        this.length = this.breadth = breadth=s;
    }

    public double area() {
        return getBreadth()*getLength();
    }

    public double perimeter(){
        return 2*getLength()*getBreadth();
    }
    public boolean isSquare(){
        if(length==breadth)
            return true;
        else return false;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
