package com.company;

public class MySolution {
    public static int waterPlants(int[] plants, int cap1, int cap2) {
        int can1 = 0, can2 = 0;
        int low = 0, high = plants.length - 1;
        int numRefills = 0;

        while (low <= high) {
            if (can1 < plants[low]) {
                can1 = cap1;
                numRefills++;
            }
            if (can1 < plants[high]) {
                can2 = cap2;
                numRefills++;
            }
            can1 -= plants[low++];
            can2 -= plants[high--];
        }
        if (low == high && plants[low] > can1 +can2) {
            return numRefills++;
        } else {
            return numRefills;
        }
    }
}
