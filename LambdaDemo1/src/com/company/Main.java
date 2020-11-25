package com.company;


interface MyLambda {
    public void display();
}

class UseLambda {
    public void callLambda(MyLambda myLambda) {
        myLambda.display();
    }
}

class Demo {
    int temp = 10;

    public void method1() {
        int count = 0;
        MyLambda m = () -> {
            //int count = 0;
            //count++; //could not modify it inside lambda expression, only final or effectively final
            System.out.println("Bye" + count);
            System.out.println("Bye" + (temp++));
            // temp belongs to the class, lambda can modify it,
            // count is inside the method of where the lambda is defined, so inside lambda,
            // it can not modify it or after lambda, it can not be modified either
        };
        //count++; //could not modify it inside lambda expression, only final or effectively final
    }

    public void method2() {
        UseLambda ul = new UseLambda();
        ul.callLambda(() -> { System.out.println("Hello"); });//pass lambda as an object or parameter
    }
}

public class Main {

    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
        d.method2();

    }
}
