package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 3, 5, 6, 7, 90, 342, 452, 4245};
        ArrayReader reader = new ArrayReader(nums);
        System.out.println(searchBigSortedArray(reader, 10));
    }

    public static int searchBigSortedArray(ArrayReader reader, int target) {
        int index = 1;
        while (reader.get(index-1) != -1 && reader.get(index-1) < target)
            index = index*2;

        int lo = 0, hi = index - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (reader.get(mid) < target) {
                lo = mid + 1;
            } else if (reader.get(mid) > target) {
                hi = mid - 1;
            } else
                return mid;
        }
        return -1;
    }
}
