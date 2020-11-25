package com.company;

@FunctionalInterface
interface MyLambda {
    //public void display(String s);
    public int add(int x, int y);
}
/*
class My implements MyLambda {
    public void display() {
        System.out.println("Hello World");
    }
}
*/

public class Main {

    public static void main(String[] args) {
        //() is display(), overriding display() method
        //MyLambda m = (s) -> { System.out.println(s); };
        //m.display("Hello world");

        MyLambda m = (a, b) -> a + b;
        int result = m.add(20, 30);
        System.out.println(result);
    }
}
