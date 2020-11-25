package com.company;

//
class MyRun implements Runnable {
    @Override
    public void run() {

    }
}
//
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread("My thread 1");
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.start();
        System.out.println(t.getState());
        System.out.println(t.isAlive());
        t.interrupt();// will cause interruptedException
    }
}
