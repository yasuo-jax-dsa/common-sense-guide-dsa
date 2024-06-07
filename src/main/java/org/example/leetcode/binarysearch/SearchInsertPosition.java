package org.example.leetcode.binarysearch;

public class SearchInsertPosition {

    public static void main(String[] args) {

        var values = new int[]{1, 3};
        var target = 1;

        var res = doSearchInsert(values, target);
        System.out.println(res);
    }

    private static int doSearchInsert(int[] nums, int target) {

        int upperBound = nums.length - 1;
        int lowerBound = 0;
        int middleIndex;

        while (upperBound >= lowerBound) {

            middleIndex = lowerBound + (upperBound - lowerBound) / 2;

            if (target == nums[middleIndex]) {
                return middleIndex;
            }

            if (upperBound == lowerBound) {
                if (target < nums[middleIndex]) {
                    return middleIndex;
                } else {
                    return middleIndex + 1;
                }
            }

            if (target > nums[middleIndex]) {
                lowerBound = middleIndex + 1;
            } else if (target < nums[middleIndex]) {
                upperBound = middleIndex;
            }
        }
        return -1;
    }
}
