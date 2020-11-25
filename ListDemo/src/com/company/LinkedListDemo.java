package com.company;


import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> all1 = new LinkedList<>();
        LinkedList<Integer> all2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        all1.peek();
        System.out.println(all2);
        System.out.println(all2.peek());
    }
}
