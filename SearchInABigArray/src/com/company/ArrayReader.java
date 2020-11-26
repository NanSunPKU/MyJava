package com.company;

public class ArrayReader {
    int[] array = new int[1000];

    public ArrayReader(int[] array) {
        this.array = array;
    }

    public int get(int index) {
        return array[index];
    }
}
