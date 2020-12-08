package com.company;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<Integer> somefunction(final List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = nums.size()-1; i >= 0; i--) {
            result.add(nums.get(i));
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        List<Integer> result = somefunction(nums);
        System.out.println(result);
    }
}
