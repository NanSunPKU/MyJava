package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "14234";
        String s2 = "10200";
        int k1 = 5;
        int k2 = 1;

        String res1 = removeKDigits(s1, k1);
        String res2 = removeKDigits(s2, k2);
        System.out.println(res1);
        System.out.println(res2);
    }

    public static String removeKDigits(String num, int k) {
        LinkedList<Character> stack = new LinkedList<>();

        for (char digit: num.toCharArray()) {
            while (!stack.isEmpty() && k != 0 && stack.peekLast() >digit) {
                stack.removeLast();
                k--;
            }
            stack.addLast(digit);
        }

        for (int i=0; i<k; i++) {
            stack.removeLast();
        }

        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (char digit : stack) {
            if (leadingZero && digit=='0') {
                continue;
            }
            leadingZero = false;
            sb.append(digit);
        }

        if (sb.length() == 0)
            return "0";
        return sb.toString();
    }
}
