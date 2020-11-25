package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        String data = "name=Vijay;address=delhi;country=india;dept=cse";
        StringTokenizer stringTokenizer = new StringTokenizer(data, "=;");
        while (stringTokenizer.hasMoreTokens()) {
            String s = stringTokenizer.nextToken();
            System.out.println(s);
        }

        FileInputStream fileInputStream = new FileInputStream("C:\\MyJava\\StringTokenizerDemo\\TokenData.txt");
        byte[] b = new byte[fileInputStream.available()];
        fileInputStream.read(b);
        String data1 = new String(b);
        StringTokenizer stringTokenizer1 = new StringTokenizer(data1, ", ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        String s;
        while (stringTokenizer1.hasMoreTokens()) {
            s = stringTokenizer1.nextToken();
            arrayList.add(Integer.valueOf(s));
        }
        System.out.println(arrayList);
    }
}
