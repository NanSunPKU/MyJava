package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s = "CatMat";
        Set<String> dict = new HashSet<>(List.of("Cat", "Mat", "Ca", "tM", "at", "C", "Dog", "og", "Do"));
        int result = wordBreak(s, dict);
        System.out.println(result);
    }
    public static int wordBreak(String s, Set<String> dict) {
        if (s == null || s.length() == 0 || dict == null) {
            return 0;
        }
        Set<String> lowerDict = new HashSet<String>();
        for (String str: dict) {
            lowerDict.add(str.toLowerCase());
        }
        return dfs(s.toLowerCase(), 0, lowerDict, new HashMap<>());
    }

    private static int dfs(String s,
                    int index,
                    Set<String> lowerDict,
                    Map<Integer, Integer> memo) {
        if (index == s.length())
            return 1;
        if (memo.containsKey(index))
            return memo.get(index);

        int num = 0;
        for (int i = index + 1; i <= s.length(); i++) {
            if (!lowerDict.contains(s.substring(index, i))) {
                continue;
            }
            num += dfs(s, i, lowerDict, memo);
        }
        memo.put(index, num);
        return num;
    }
}
