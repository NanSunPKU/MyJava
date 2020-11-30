package com.company;

import java.util.Arrays;

public class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];

        for (int i = 0; i<n; i++) {
            jobs[i] = new int[]{endTime[i], startTime[i], profit[i]};
        }

        Arrays.sort(jobs);
        int[] dp = new int[n];
        dp[0] = jobs[0][2];

        for (int i = 1; i < n; i++) {
            int curValue = jobs[i][2];
            int index = binarySearch(jobs, jobs[i][1], i - 1);
            if (index != -1) {
                curValue += dp[index];
            }

            dp[i] = Math.max(dp[i-1], curValue);
        }
        return dp[n-1];
    }

    public int binarySearch(int[][] jobs, int endTime, int r) {
        int l = 0;
        while (l < r) {
            int m = l + (r-l)/2;
            if (jobs[m][0] <= endTime)
                l = m + 1;
            else
                r = m;
        }
        return jobs[l][0] <= endTime ? l : l -1;
    }
}
