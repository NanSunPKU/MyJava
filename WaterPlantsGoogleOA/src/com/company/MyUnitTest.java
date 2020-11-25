package com.company;

import org.junit.Assert;

public class MyUnitTest {

    public void testSolution1() {
        Solution1 solution1 = new Solution1();

        int[] plants = {2, 4, 5, 1 ,2};
        int capacity1 = 5;
        int capacity2 = 7;
        int result = solution1.waterPlants(plants, capacity1, capacity2);
        Assert.assertEquals(result, 4);
    }

    public void testMySolution() {
        MySolution mySolution = new MySolution();

        int[] plants = {2, 4, 5, 1 ,2};
        int capacity1 = 5;
        int capacity2 = 7;
        int result = mySolution.waterPlants(plants, capacity1, capacity2);
        Assert.assertEquals(result, 3);

        int[] plants1 = { 5, 5, 5, 5, 5, 10, 7, 7, 7, 7, 7 };
        int capacity11 = 5;
        int capacity21 = 7;
        int result1 = mySolution.waterPlants(plants1, capacity11, capacity21);
        Assert.assertEquals(result1, 12);
    }
}
