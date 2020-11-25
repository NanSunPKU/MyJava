package com.company;

public class BoxingDemo {
    Integer integer = new Integer(10);
    Integer a = Integer.valueOf(10);
    Integer b = 10;

    Byte c = 15;
    Byte d = Byte.valueOf("15");

    //Boxing or wrapping
    Byte bb = 15;
    Byte e = Byte.valueOf(bb);

    Short f = Short.valueOf("123");

    Float g = 12.3f;

    //Auto unboxing
    Float h = Float.valueOf("123.5");
    float x = h.floatValue();
    float y = x;

    Double j = Double.valueOf(123.456);

    Character k = Character.valueOf('a');

    Boolean l = Boolean.valueOf("true");

    int m = 10;
    //auto boxing
    Integer n = m;//Integer.valueOf(m);
    //auto unboxing
    int p = n; // n.intValue();
}
