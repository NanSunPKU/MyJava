package com.company;


public class SmartTV extends TV {
    @Override
    public void switchOn() {
        System.out.println("SmartTV is switched on!");
    }

    @Override
    public void changeChannels() {
        System.out.println("SmartTC channel is changed!");
    }

    public void browse() {
        System.out.println("SmartTV browsing!");
    }
}
