package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        a = scanner.nextInt();
        b = scanner.nextInt();

        try {
            c = a / b;
            System.out.println("Division is " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        }
        System.out.println("Bye");

    }
}
