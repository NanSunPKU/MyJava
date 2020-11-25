package com.company;

import java.util.Stack;

public class Solution2 {
    public String licenseKeyFormatting(String S, int K) {
        int count = 0;
        int index = S.length() - 1;
        Stack<Character> stack = new Stack<Character>();
        StringBuilder stringBuilder = new StringBuilder();

        while (index >= 0) {
            char ch = Character.toUpperCase(S.charAt(index));
            if (ch == '-')
                index--;
            else if (count == K) {
                stack.push('-');
                count = 0;
            }
            else {
                stack.push(ch);
                count++;
                index--;
            }
        }

        while(!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();
    }

}
