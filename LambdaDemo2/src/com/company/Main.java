package com.company;


interface MyLambda {
    public void display(String str);
}

public class Main {

    public void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        //display() is reverse() in Main class now, below will print "naN olleH"
        // reverse is static, so it can be assigned like this, but if it is not static
        //non static member could be assigned by creating an object
        Main m = new Main();
        MyLambda ml = m::reverse;
        ml.display("Hello Nan");
    }
}
