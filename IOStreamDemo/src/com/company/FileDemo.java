package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("C:/MyJava/Test.txt");
            String str = "Learn Java programming by Anna";

            byte[] b = str.getBytes();

            fos.write(b, 6, str.length()-6);

//            for (byte x : b)
//                fos.write(x);
//            fos.write(str.getBytes());

            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
