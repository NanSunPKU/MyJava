package com.company;

public class Main {

    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);
        t.start();

        int i = 1;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
