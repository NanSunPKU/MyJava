package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>(5);

        lhs.add("A");
        lhs.add("C");
        lhs.add("B");
        lhs.add("B");
        System.out.println("It will print the order in which they are inserted:");
        System.out.println(lhs);

        System.out.println("Using iterator to print: ");
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        HashSet<String> lhs1 = new HashSet<>(5);

        lhs1.add("A");
        lhs1.add("C");
        lhs1.add("B");
        lhs1.add("B");
        System.out.println("It will print the sorted order:");
        System.out.println(lhs1);

        System.out.println("Using iterator to print: ");
        Iterator<String> itr1 = lhs1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}
