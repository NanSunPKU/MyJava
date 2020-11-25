package com.company;

import java.io.*;

public class CopyFilesIntoOne {
    public static void main(String[] args) {
        try {

            //read from source1.txt and source2.txt
            FileInputStream fis1 = new FileInputStream("C:/MyJava/source1.txt");
            FileInputStream fis2 = new FileInputStream("C:/MyJava/source2.txt");

            FileOutputStream fos = new FileOutputStream("c://MyJava/destination.txt");

            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

            int b;
            while ((b = sis.read()) != -1) {
                fos.write(b);
            }
            sis.close();
            fis1.close();
            fis2.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
