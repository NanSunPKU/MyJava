package com.company;


interface MyLambda {
    public int display(String str1, String str2);
}

public class LambdaDemo3 {

    public LambdaDemo3(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        //MyLambda ml = LambdaDemo3::new;//lambda use a constructor, reference to constuctor, new
        MyLambda ml = String::compareTo;
        System.out.println(ml.display("hello", "hello"));
    }
}
