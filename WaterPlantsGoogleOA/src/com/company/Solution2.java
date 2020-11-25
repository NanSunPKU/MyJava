package com.company;

public class Solution2 {
    private static int refills(int[] plants, int capacity1, int capacity2) {
        int n = plants.length;
        // Friend 1 position on plants row
        int pos1 = 0;
        // Friend 2 position on plants row
        int pos2 = n-1;

        // Water available with friend 1
        int water1 = 0;
        // Water available with friend 2
        int water2 = 0;

        // Amount of refills done
        int refills = 0;

        // We will iterate the loop till:
        // both friends meet on same position (in case n is odd)
        // friend1 is just before crossing friend2 (in case n is even)
        while (pos1 <= pos2) {
            // If both the friends meet at same position (n is odd) then
            // both will together water the plant with the collective
            // amount of water they both have. If water is not sufficient
            // then one of them need to refill. We don't care which one
            // have to refill beacuse we are only interested in refills count.
            if (pos1 == pos2) {
                if (water1 + water2 < plants[pos1]) {
                    refills++;
                    break;
                }
                break;
            }

            if (water1 < plants[pos1]) {
                refills++;
                water1 = capacity1;
            }
            water1 -= plants[pos1];

            if (water2 < plants[pos2]) {
                refills++;
                water2 = capacity2;
            }
            water2 -= plants[pos2];

            pos1++;
            pos2--;
        }

        return refills;
    }
}
