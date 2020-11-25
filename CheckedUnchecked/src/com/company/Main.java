package com.company;
import java.io.*;

class LowBalanceException extends Exception {
    public String toString() {
        return "Balance should not be less than 5000";
    }
}

public class Main {

    public static void main(String[] args) {
        fun3();
    }

    public static void fun1() {
        try {
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            System.out.println(e);
        }
        // checked exception
        //FileInputStream fi = new FileInputStream("My.txt");

        //unchecked exception
//        System.out.println(10/0);

//        try {
//            System.out.println(10/0);
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
    }

    public static void fun2() {
        fun1();
    }
    public static void fun3() {
        fun2();
    }
}
