package com.company;

public class Main {

    public static void main(String[] args) {
        int m1 = 15;

        Integer m2 = Integer.valueOf("123");
        Integer m3 = Integer.valueOf("A7", 16);//hexidecimal
        Integer m4 = Integer.decode("0xA7");
        System.out.println(m4);
        //Integer.reverseBytes()
    }
}
