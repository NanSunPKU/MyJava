package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOutDemo {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:/MyJava/Test.txt");

            int x;

            while ((x=fis.read()) != -1)
                System.out.print((char)x);
            System.out.println();
            //one read method
//            byte[] bytes = new byte[fis.available()];
//            fis.read(bytes);
//            String str = new String(bytes);
//            System.out.println(str);
            System.out.println("Using FileReader to read data:");
            FileReader fr = new FileReader("C:/MyJava/Test.txt");

            int y;

            while ((y=fr.read()) != -1)
                System.out.print((char)y);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
