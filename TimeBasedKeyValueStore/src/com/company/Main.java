package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TimeMap obj = new TimeMap();
        String[] orders1 = {"TimeMap", "set","get","get","set","get","get"};
        Object[][] inputs1 = {{""}, {"foo", "bar", 1}, {"foo", 1}, {"foo", 3}, {"foo", "bar2", 4}, {"foo", 4}, {"foo", 5}};
        String[] outputs = {null, null, "bar", "bar", null, "bar2", "bar2"};

        String[] testOutputs = testTimeMap(orders1, inputs1);

        System.out.println("Your results match the right outputs: " + Arrays.equals(testOutputs, outputs));
        assert Arrays.equals(testOutputs, outputs) : "results are NOT correct!";
    }

    public static String[] testTimeMap(String[] orders, Object[][] inputs) {

        if (orders[0] != "TimeMap") {
            System.out.println("Need to create a TimeMap object first!");
            return new String[]{""};
        }

        TimeMap timeMap = new TimeMap();
        String[] results = new String[orders.length];

        for (int i = 1; i < orders.length; i ++) {
            String order = orders[i];
            Object[] input = inputs[i];

            if (order == "set") {
                timeMap.set((String)input[0], input[1].toString(), (int)input[2]);
                results[i] = null;
            }

            if (order == "get") {
                results[i] = timeMap.get((String)input[0], (int)input[1]);
            }
        }
        return results;
    }
}
