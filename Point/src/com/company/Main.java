package com.company;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(3,4);
        System.out.println(p.x +","+p.y);
    }
}

class Point {
    protected int x, y;

    public Point (int _x, int _y) {
        this.x = _x;
        y = _y;

        x = 900;
    }

}
