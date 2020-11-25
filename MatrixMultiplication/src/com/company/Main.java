package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] A = {{3,5,9},{7,6,2},{4,3,5}};
        int[][] B = {{1,0,0},{0,1,0},{0,0,1}};

        int n = A.length;
        int[][] C = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for (int k=0; k<n; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for(int[] c: C) {
            for (int x : c)
                System.out.print(x+" ");
            System.out.println("");
        }
    }
}
