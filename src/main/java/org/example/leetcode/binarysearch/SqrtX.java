package org.example.leetcode.binarysearch;

public class SqrtX {
    public static void main(String[] args) {
        int x = 143;
        var root = rootSqrt(x);
        System.out.println(root);
    }

    public static int rootSqrt(int x) {
        int start = 1;
        int end = x;

        if (x == 1 || x == 0) return x;

        while(end >= start){
            int mid = start + (end - start) / 2;
            if (x/mid == mid) {
                return mid;
            } else if (x/mid > mid) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return end;
    }
}
