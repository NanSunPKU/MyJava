package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) throws Exception {
        //Property class usually used in application settings
        Properties p = new Properties();
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");

        p.store(new FileOutputStream("MyData.txt"), "Laptop");

        p.storeToXML(new FileOutputStream("MyData.xml"), "Laptop");


        p.load(new FileInputStream("MyData.txt"));

        System.out.println(p);
    }
}
