package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Cuboid cuboid1 = new Cuboid();//length, breadth, height = 1, non-parameter Rectangle() and Cuboid() ar called.
//        Cuboid cuboid1 = new Cuboid(10);//single parameter Cuboid(int x) is call, 10 is passed to height
        Cuboid cuboid1 = new Cuboid(3,4,10);
        System.out.println(cuboid1.volume());
    }
}
