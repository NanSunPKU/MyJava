package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Absolute: ");
        System.out.println(Math.abs(-123));
        System.out.println(StrictMath.abs(-123));

        System.out.println("Cube root: ");
        System.out.println(Math.cbrt(27));

        System.out.println("Exact decrement ");
        System.out.println(Math.decrementExact(7));
        //System.out.println(Math.decrementExact(Integer.MIN_VALUE));// throw exception
        int i = Integer.MIN_VALUE;
        System.out.println(i--);

        System.out.println("Random: " + Math.random()*1000);
    }
}
