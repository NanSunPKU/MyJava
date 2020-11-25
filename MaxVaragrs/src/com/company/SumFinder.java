package com.company;

public class SumFinder {
    public int sum(int ...A){
        int s = 0;
        for(int i=0;i<A.length;i++){
            s += A[i];
        }
        return s;
    }
}
