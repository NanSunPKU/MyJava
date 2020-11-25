package com.company;

public class Main {

    public static void main(String[] args) {
        MaxFinder maxFinder = new MaxFinder();

        int res = maxFinder.max(2,20,50,101);
        int res1 = maxFinder.max();
        System.out.println(res1);

        SumFinder sumFinder = new SumFinder();
        int sum = sumFinder.sum(1,2,3);
        System.out.println(sum);
    }

    static double discount(double ...P){
        double sum=0;
        for(int i=0;i<P.length;i++)
            sum += P[i];

        if(sum<500) return sum*0.9;
        else if(sum>=500 && sum<1000) return sum*0.85;
        else return sum*0.8;
    }

}
