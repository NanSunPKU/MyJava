package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>(20);
        ArrayList<Integer> all1 = new ArrayList<>(List.of(50, 60, 70, 80));

        all.add(10);
        all.add(0, 3);
        all.addAll(1,all1);
        System.out.println(all);

        all.set(5, 111);
        System.out.println(all);

        for (Integer integer : all) {
            System.out.println(integer);
        }

        for (Integer x : all) {
            System.out.println(x);
        }

        Iterator<Integer> it = all.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()+"!");
        }

        all.forEach(System.out::println);

        all.forEach(n -> show(n));

//        ArrayList<Integer> all2 = new ArrayList<>(List.of(50, 60, 70, 80));
//        System.out.println(all2);
//        ListIterator<Integer> it1 = all2.listIterator(all2.size());
//        while (it1.hasPrevious()) {
//            System.out.println(it1.previous()+"?");
//        }

    }

    static void show(int n) {
        if (n > 60)
            System.out.println(n);
//        System.out.println(n > 60? n: null);
    }
}
