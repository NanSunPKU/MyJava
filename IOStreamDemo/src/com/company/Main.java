package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(3);

        nums.add(a);
        nums.add(b);
        System.out.println(nums);
        nums.add(new ArrayList<>(b));
        System.out.println(nums);

    }
}
