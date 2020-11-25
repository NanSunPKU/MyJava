package com.company;
import java.lang.*;

public class Generic<T> {

    T[] data = (T[]) new Object[3];

    public static void main(String[] args) {
        Generic<String> gd = new Generic();

        gd.data[0] = "Hi";
        //gd.data[1] = new Integer(5);
        String string = gd.data[0];
    }
}
