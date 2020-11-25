package com.company;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharDemo {
    public static void main(String[] args) throws IOException {

        char[] chars = {'a', 'v', 'f'};

        CharArrayReader charArrayReader = new CharArrayReader(chars);

        int x;
        while ( (x = charArrayReader.read()) > 0) {
            //System.out.println(x);
            System.out.println((char)x);
        }
    }
}
