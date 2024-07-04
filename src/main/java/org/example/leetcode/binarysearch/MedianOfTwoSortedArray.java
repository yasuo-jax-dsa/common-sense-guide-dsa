package org.example.leetcode.binarysearch;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {

        int[] A = {1, 3, 5, 6, 8};
        int[] B = {7, 9, 10, 11, 15, 20};
        System.out.println("Median of the two arrays is: " + findMedianSortedArrays(A, B));

    }

    public static double findMedianSortedArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;

        // Ensure A is the smaller array
        if (n > m) {
            return findMedianSortedArrays(B, A);
        }

        int start = 0;
        int end = n;
        int realMidInMergedArray = (n + m + 1) / 2;

        while (start <= end) {
            int midA = (start + end) / 2;
            int midB = realMidInMergedArray - midA;

            int leftA = (midA > 0) ? A[midA - 1] : Integer.MIN_VALUE;
            int rightA = (midA < n) ? A[midA] : Integer.MAX_VALUE;

            int leftB = (midB > 0) ? B[midB - 1] : Integer.MIN_VALUE;
            int rightB = (midB < m) ? B[midB] : Integer.MAX_VALUE;

            // Check if we have found the correct partition
            if (leftA <= rightB && leftB <= rightA) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                } else {
                    return Math.max(leftA, leftB);
                }
            } else if (leftA > rightB) {
                end = midA - 1;
            } else {
                start = midA + 1;
            }
        }

        // If we reach here, it means the arrays are not sorted properly or invalid input
        throw new IllegalArgumentException("Input arrays are not sorted or invalid input");
    }
}
