package com.company;

import java.io.*;

public class ByteDemo {
    public static void main(String[] args) {

        byte[] bytes = {'a', 'b', 'c', 'd'};

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);

//        int x;
//        while ((x= bis.read()) > 0)
//            System.out.println((char)x); //output will be abcd

        String string1 = new String(bis.readAllBytes());
        System.out.println(string1);//output will be abcd

        bis.markSupported();


        try {
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('z');
        bos.write(200);
        bos.write(64);//int is the unicode decimal code



        try {
            bos.writeTo(new FileOutputStream("C:/MyJava/ByteDemoTestOutput.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        byte[] bytes1 = bos.toByteArray();
        for (byte x: bytes1) {
            System.out.print((char)x);
        }

        try {
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
