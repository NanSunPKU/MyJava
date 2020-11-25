package com.company;


import java.util.List;
import java.util.TreeSet;


class Point implements Comparable{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + " y=" + y;
    }
    @Override
    public int compareTo(Object o) {
        Point p = (Point)o;
        if (this.x < p.x) return -1;
        else if (this.x > p.x) return 1;
        else {
            if (this.y < p.y) return -1;
            else if (this.y > p.y) return 1;
            else return 0;
        }
    }
}

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50, 70, 40));
        ts.add(25);
        System.out.println(ts.ceiling(51));

        TreeSet<Point> ts1 = new TreeSet<>();
        ts1.add(new Point(1, 1));
        ts1.add(new Point(2, 3));
        ts1.add(new Point(2, 1));
        System.out.println(ts.ceiling(51));
        System.out.println(ts1);

    }

}
