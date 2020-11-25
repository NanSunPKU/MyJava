package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentChallenge {
    public static void main(String[] args) {

        try {
            //create the source1.txt
            FileOutputStream fos = new FileOutputStream("C:/MyJava/source1.txt");
            String string = "JAVA TEST FILE";
            fos.write(string.getBytes());

            //read from source1.txt and create a new file source2.txt
            FileInputStream fis = new FileInputStream("C:/MyJava/source1.txt");
            FileOutputStream fos1 = new FileOutputStream("C:/MyJava/source2.txt");

            //copy the content in source1 to source 2 but in lower case
            int x;
            while ((x=fis.read()) != -1)
                if (x >= 65 && x <= 90)
                    fos1.write(x+32);
                else
                    fos1.write(x);

            fos.close();
            fis.close();
            fos1.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
