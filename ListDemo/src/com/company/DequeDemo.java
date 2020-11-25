package com.company;

import java.util.ArrayDeque;

public class DequeDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.pollLast();//works as a stack, LILO
        dq.pollFirst();//works as a queue,FIFO

        /*dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerFirst(30);
        dq.offerFirst(40);*/
        dq.forEach(x -> System.out.println(x));

        int a = 909000;

        System.out.println((a*1.0)/11);
        System.out.println(((float)a)/11);
    }
}
