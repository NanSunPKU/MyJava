package com.company;

public class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    public void videoCall() {
        System.out.println("SmartPhone video calling");
    }

    @Override
    public void click() {
        System.out.println("SmartPhone click");
    }

    @Override
    public void record() {
        System.out.println("SmartPhone record");
    }

    @Override
    public void play() {
        System.out.println("SmartPhone play music");
    }

    @Override
    public void stop() {
        System.out.println("SmartPhone stopped playing music");
    }
}
