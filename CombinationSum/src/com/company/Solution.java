package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, target, 0, path, result);
        return result;
    }

    public void dfs(int[] nums, int target, int index, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
//                System.out.println(path);
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < nums.length; i++) {

            int remain = target - nums[i];
            if (remain < 0) {
                System.out.println(remain);
                break;
            }

            path.add(nums[i]);
            System.out.println(path);

            dfs(nums, remain, i, path, result);
            path.remove(path.size()-1);
        }
    }
}
