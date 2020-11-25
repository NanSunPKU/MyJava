package com.company;


import java.util.List;

public class UtilizationCheck {
    private static final int LIMIT = 2 * 100_000_000;

    public static int finalInstances(int instances, List<Integer> averageUtil) {
        for (int i = 0; i < averageUtil.size(); i++) {
            if (averageUtil.get(i) < 25 && instances > 1) {
                instances = instances/2 + ((instances % 2 == 0) ? 0 : 1);
                i += 10;
            }
            else if (averageUtil.get(i) > 60) {
                instances = 2 * instances;
                i += 10;
            }
        }
        return instances;
    }
}
