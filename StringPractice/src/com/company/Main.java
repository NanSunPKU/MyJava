package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 153;
        int m = n;
        int new_number=0;
        int reminder = 0;

        while(m >0){
            reminder = m%10;
            m=m/10;
            new_number = new_number *10 + reminder;
        }
        System.out.println("Is " + n + " a Palindrome?");
        System.out.println(new_number==n);


//        Scanner sc = new Scanner(System.in);
//
////        System.out.println("Please enter the email address; ");
////        String email = sc.nextLine();
//        String str = "15/15/1546";
//        System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
//
//        String str1 = " aB$3 45!@$ rgr    gg   df    w90";
//        System.out.println(str1.replaceAll("\\s+", " ").trim());


    }
}
