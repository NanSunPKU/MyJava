package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyCom implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) return 1;
        if (o1 > o2) return -1;
        else return 0;
    }
}


public class PriorityDemo {

    public static void main(String[] args) {

        System.out.println("min heap: ");

        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(2);
        p.add(15);
        p.add(50);
        p.add(34);
        System.out.println(p.peek());
        System.out.println(p);
        p.forEach(x -> System.out.println(x));;

        p.poll();//delete, log n time
        p.forEach(x -> System.out.println(x));;

        PriorityQueue<Integer> p1 = new PriorityQueue<>(new MyCom());
        p1.add(2);
        p1.add(15);
        p1.add(50);
        p1.add(34);
        System.out.println("max heap: ");
        p1.forEach(x -> System.out.println(x));;

    }
}
