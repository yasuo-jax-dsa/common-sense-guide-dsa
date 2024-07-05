package org.example.leetcode.binarysearch;

public class ArrangeCoins {

    public static void main(String[] args) {

        long n = 8;
        System.out.println(arrangeCoins(n));
    }

    private static int arrangeCoins(long n) {
        long left = 1, right = n;

        while(left <= right) {
            long mid = left + (right - left) / 2; // (left + right) / 2

            if(mid * (mid + 1) / 2 <= n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return (int) left - 1;
    }
}
