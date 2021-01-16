package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String[][] regions = {{"Earth","North America","South America"},
                {"North America","United States","Canada"},
                {"United States","New York","Boston"},
                {"Canada","Ontario","Quebec"},
                {"South America","Brazil"}};

        List<List<String>> regions1 = Arrays.stream(regions)
                .map(Arrays::asList)
                .collect(Collectors.toList());

        String region1 = "Quebec";
        String region2 = "New York";

        Solution solution = new Solution();
        String result = solution.findSmallestRegion(regions1, region1, region2);
        System.out.println(result);
    }
}
