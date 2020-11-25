package com.company;

public class Cuboid extends Rectangle {
    private int height;

    public Cuboid() {
        this.height = 5;
    }
    public Cuboid(int height) {
        this.height = height;
    }

    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public int volume() {
        return height*this.getBreadth()*this.getLength();
    }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height=height; }
}
