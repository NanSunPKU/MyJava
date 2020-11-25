package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int instances = 2;
        List<Integer> averageUtil = Arrays.asList(25,23,1,2,3,3,3,3,3,3,3,3000,3,76,80);

        int finalInstances = UtilizationCheck.finalInstances(instances, averageUtil);
        System.out.println(finalInstances);
    }
}
