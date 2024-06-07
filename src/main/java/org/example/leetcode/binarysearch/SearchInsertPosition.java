package org.example.leetcode.binarysearch;

public class SearchInsertPosition {

    public static void main(String[] args) {

        var values = new int[]{1, 3, 5, 6};
        var target = 2;

        var res = doSearchInsert(values, target);
        System.out.println(res);
    }

    private static int doSearchInsert(int[] values, int target) {

        int upperBound = values.length - 1;
        int lowerBound = 0;
        int middleIndex;

        while (upperBound >= lowerBound) {
            middleIndex = lowerBound + (upperBound - lowerBound) / 2;

            if (upperBound == lowerBound) {
                if (target < values[middleIndex]) {
                    return middleIndex;
                } else {
                    return middleIndex + 1;
                }
            }

            if (target > values[middleIndex]) {
                lowerBound = middleIndex + 1;
            } else if (target < values[middleIndex]) {
                upperBound = middleIndex - 1;
            } else if (target == values[middleIndex]) {
                return middleIndex;
            }
        }
        return -1;
    }
}
