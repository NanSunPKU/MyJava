package com.company;


class Demo {
    int a, b;

    public Demo() {
        this.a = 10;
        this.b = 20;
    }


    public void print() {
        System.out.println("a= " + a + " b= " + b + "n");
    }
}
public class Main {

    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = obj1;

        obj1.a += 1;
        obj1.b += 1;

        obj1.print();
        obj2.print();
    }
}
