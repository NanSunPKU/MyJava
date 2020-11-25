package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = sc.nextInt();
        String n_reverseString = reverse(n);
        for (int i = n_reverseString.length()-1; i >=0 ; i--) {
            printDigit(n_reverseString.charAt(i));
        }
    }
    public static String reverse(int number) {
        int m = number;
        int sum = 0;
        String new_number="";
        int reminder = 0;

        while(m >0){
            reminder = m%10;
            m=m/10;
            sum = sum *10 + reminder;
            new_number += reminder;
        }
        return new_number;
    }
    public static void printDigit(Character character) {
        switch (character){
            case '0' :
                System.out.print("Zero ");
                break;
            case '1' :
                System.out.print("One ");
                break;
            case '2' :
                System.out.print("Two ");
                break;
            case '3' :
                System.out.print("Three ");
                break;
            case '4' :
                System.out.print("Four ");
                break;
            case '5' :
                System.out.print("Five ");
                break;
            case '6' :
                System.out.print("Six ");
                break;
            case '7' :
                System.out.print("Seven ");
                break;
            case '8' :
                System.out.print("Eight ");
                break;
            case '9' :
                System.out.print("Nine ");
                break;
            default:
                System.out.print("Invalid");
        }
    }
}
