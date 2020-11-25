package com.company;

public class Main {

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.method1();
        sub.method2();
        sub.method3();

        Super super1 = new Sub();
        super1.method1();
        super1.method2();
    }
}
