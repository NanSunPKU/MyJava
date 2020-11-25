package com.company;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        length=breadth=1;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() { return length; }
    public int getBreadth() { return breadth; }

    public void setLength(int length) { this.length = length; }
    public void setBreadth(int breadth) { this.breadth = breadth; }
}
