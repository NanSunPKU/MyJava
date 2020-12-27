package com.company;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "3+8/9*526+6-8*4+562";
        int result = solution.calculate(s);
        System.out.println(result);
    }
}
