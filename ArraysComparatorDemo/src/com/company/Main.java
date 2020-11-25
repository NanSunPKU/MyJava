package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2};
        System.out.println(Arrays.compare(a, b));;
        System.out.println(Arrays.compare(a, c));
        System.out.println(Arrays.compare(c, a));

        for (int x : Arrays.copyOf(a, 2))
            System.out.println(x);

        int[] d = {2, 3, 4, 1, 8, 7};
        Arrays.sort(d);
        for (int y: d)
            System.out.println(y);
        System.out.println("Binary Search can only be done on sorted array:");
        System.out.println("The index of element 2 is: "+Arrays.binarySearch(d, 2));

        Integer[] e = {5, 6, 2, 3, 4, 1, 8, 7};
        Arrays.sort(e, new MyComparator());
        System.out.println("Sort based on customized comparator");
        for (int i: e)
            System.out.println(i);
    }
}
