package com.company;

public class Main {

    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
        Outer1 o1 = new Outer1();
    }
}


class Outer {
    int x = 10;

    class Inner {
        int y = 20;
        void innerDisplay() {
            System.out.println(x + " " + y);
        }
    }

    public void outerDisplay() {
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}
