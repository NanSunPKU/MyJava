package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        int[] nums = new int[]{2,3,6,7};
        int target = 7;

        List<List<Integer>> result = solution.combinationSum(nums, target);
        System.out.println(result);

    }
}
