package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(20, 0.25f);
        hs.add(10);
        hs.add(20);
        hs.add(10);
        System.out.println(hs);

        //int[] array1 = {1,2};
        Integer[] array1 = new Integer[]{1, 2};
        ArrayList<Integer> array2 = new ArrayList<Integer>(Arrays.asList(array1));
        System.out.println(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(array2);
    }
}
