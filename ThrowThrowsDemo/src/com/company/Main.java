package com.company;

public class Main {

    public static void main(String[] args) throws NegativeDimensionException {
        meth2();

    }
    static int area(int l, int b) throws NegativeDimensionException {
        if (l < 0 || b < 0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void meth2() throws NegativeDimensionException {
        System.out.println("area is " + area(-10, 5));
    }
}


class NegativeDimensionException extends Exception
{
    public String toString() {
        return "Dimension blabla";
    }
}