package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    /**
     * @param candidates: A list of integers
     * @param target: An integer
     * @return: A list of lists of integers
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        // 集合为空
        if (candidates.length == 0) {
            return results;
        }
        Arrays.sort(candidates);
        List<Integer> combination = new ArrayList<>();
        // dfs
        dfs(candidates, 0, target, combination, results);
        return results;

    }

    private void dfs(int[] candidates, int startIndex, int remainTarget, List<Integer> combination, List<List<Integer>> results) {

        if (remainTarget == 0) {
            //System.out.println(combination);
            results.add(new ArrayList<Integer>(combination));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (remainTarget < candidates[i]) {
                break;
            }

            if (i != 0 && candidates[i] == candidates[i-1]) {
                continue;
            }
            //System.out.println(combination);

            combination.add(candidates[i]);
            dfs(candidates, i, remainTarget - candidates[i], combination, results);
            combination.remove(combination.size()-1);
        }

    }
}