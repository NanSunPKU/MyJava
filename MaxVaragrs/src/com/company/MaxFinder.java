package com.company;

public class MaxFinder {
    public int max(int ...A){
        if (A.length==0) return Integer.MIN_VALUE;
        int m = A[0];
        for (int i=1; i<A.length;i++) {
            if (A[i] > m) m=A[i];
        }
        return m;
    }
}
