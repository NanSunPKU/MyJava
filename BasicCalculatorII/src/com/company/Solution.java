package com.company;

import java.util.Stack;

class Solution {
    public int calculate(String s) {
        if (s==null || s.isEmpty()) return 0;
        int len = s.length();
        int curNumber = 0, lastNumber = 0, result = 0;
        Stack<Integer> stack = new Stack<Integer>();
        char operator = '+';
        for(int i = 0; i < len; i++) {
            char cur = s.charAt(i);
            if (Character.isDigit(cur)) {
                curNumber = curNumber*10 + (cur - '0');
            }
            if (!Character.isDigit(cur) && !Character.isWhitespace(cur) || i == len-1) {
                if (operator == '+') {
                    result += lastNumber;
                    lastNumber = curNumber;
                } else if (operator == '-') {

                    result += lastNumber;
                    lastNumber = -curNumber;
                    // System.out.println(result);
                } else if (operator == '*') {
                    lastNumber *= curNumber;
                } else if (operator == '/') {
                    lastNumber /= curNumber;
                }
                operator = cur;
                curNumber = 0;
            }
        }
        result += lastNumber;
        // System.out.println(result);
        return result;
    }
}
