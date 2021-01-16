package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
        HashMap<String, String> map = new HashMap<>();
        for (List<String> region: regions) {
            String parent = region.get(0);
            for (int i = 1; i < region.size(); i++) {
                map.put(region.get(i), parent);
            }
        }

        Set<String> set = new HashSet<>();

        while (region1 != null) {
            set.add(region1);
            region1 = map.get(region1);
        }

        while (region2 != null) {
            if (set.contains(region2)) {
                return region2;
            }
            region2 = map.get(region2);
        }
        return region2;
    }
}
