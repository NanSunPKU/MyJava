package com.company;

public class Main {

    public static void main(String[] args) {
        String string = "5F3Z-2e-9-w";
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.licenseKeyFormatting(string, 4));

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.licenseKeyFormatting(string, 4));
    }
}


