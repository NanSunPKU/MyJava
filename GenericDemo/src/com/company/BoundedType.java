package com.company;

public class BoundedType {
    public static void main(String[] args) {

    }
}

class A {}
class B extends A {}
class MyClass<T extends A> {}
class MyClass1<T extends B> {}

interface C {}
class D implements C {}
class MyClass2<T extends C> {}
class MyClass3<T extends D> {}