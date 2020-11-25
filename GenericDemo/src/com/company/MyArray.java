package com.company;

@SuppressWarnings("unchecked")// to fix the warning of changing object to generic

public class MyArray<T> {

    T[] A = (T[]) new Object[10];

    int length = 0;

    public void append(T v){
        A[length++] = v;
    }

    public void display() {
        for (int i=0; i<length; i++) {
            System.out.println(A[i]);
        }
    }

    //This is a generic method, put <E> before return type
    static <E> void show(E... list) {
        for (E e: list) {
            System.out.println(e);
        }
    }

    static void fun(MyArray<? extends Number> obj) {
        obj.display();
    }


    public static void main(String[] args) {
        //use the generic method
        show("Hello", "World");
        show(10, 20, 30);

        System.out.println("use generic method to print:");
        MyArray<Integer> myArray = new MyArray<>();
        myArray.append(10);
        myArray.append(20);
        fun(myArray);

        MyArray myArray1 = new MyArray<>();
        myArray1.append(10);
        myArray1.append("Hello");
        fun(myArray1);

    }
}

class MyArray2 extends MyArray {
    //MyArray2 is also MyArray<T>
}

class MyArray3 extends MyArray<String> {
    //MyArray3 is also only string MyArray
}
