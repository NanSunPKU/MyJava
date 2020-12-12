package com.company;

import java.util.Arrays;

public class Solution {

    public static  int partition(int[] A, int low, int high) {
        int pivot = A[low];
        int i = low, j = high;

        while (i < j) {
            while (A[i] <= pivot && i < high) {
                i++;
            }
            while (A[j] > pivot && j >= 0) {
                j--;
            }
            if (i < j) {
                swap(A, i, j);
            }
        }
        swap(A, low, j);
        return j;
    }

    public static void swap(int[] A, int x, int y) {
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
    public static void quicksort(int[] A, int low, int high) {
        if (low < high) {
            int j = partition(A, low, high);
//            System.out.println(j);
            quicksort(A, low, j);
            quicksort(A, j+1, high);
        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{10, 2, 12, 5, 25, 1};
        quicksort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
