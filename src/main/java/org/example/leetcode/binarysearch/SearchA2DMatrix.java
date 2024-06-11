package org.example.leetcode.binarysearch;

/**
 * You are given an m x n integer matrix "matrix" with the following two properties:
 *
 * <p>Each row is sorted in non-decreasing order. The first integer of each row is greater than the
 * last integer of the previous row. Given an integer target, return true if target is in matrix or
 * false otherwise.
 *
 * <p>You must write a solution in O(log(m * n)) time complexity.
 *
 * <p>Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3 Output: true
 */
public class SearchA2DMatrix {

    public static void main(String[] args) {
        var matrix = new int[][] {{1}};
        int target = 1;
        var search = new SearchA2DMatrix();

        System.out.println(search.searchMatrix(matrix, target));
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;
        int startRow = 0, endRow = m - 1;
        int midRow = 0;
        while (startRow <= endRow) {
            midRow = startRow + ((endRow - startRow) / 2);
            if (matrix[midRow][0] > target) endRow = midRow - 1;
            else if (matrix[midRow][n - 1] < target) startRow = midRow + 1;
            else {
                break;
            }
        }
        int startCol = 0, endCol = n - 1;
        while (startCol <= endCol) {
            int midCol = startCol + (endCol - startCol) / 2;
            if (matrix[midRow][midCol] == target) {
                System.out.println("midRow: " + midRow);
                System.out.println("midCol: " + midCol);
                return true;
            } else if (matrix[midRow][midCol] < target) startCol = midCol + 1;
            else endCol = midCol - 1;
        }
        return false;
    }
}
