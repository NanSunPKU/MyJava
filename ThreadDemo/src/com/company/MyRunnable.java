package com.company;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }
}
