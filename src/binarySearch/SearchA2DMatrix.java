package binarySearch;


/*
You are given an m x n 2-D integer array matrix and an integer target.
Each row in matrix is sorted in non-decreasing order.
The first integer of every row is greater than the last integer of the previous row.
Return true if target exists within matrix or false otherwise.
Can you write a solution that runs in O(log(m * n)) time?
https://neetcode.io/problems/search-2d-matrix
 */

public class SearchA2DMatrix {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1,2,4,8}, {10, 11, 12, 13}, {14, 20, 30, 40}}, 10));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int matrixArrayIndex = 0;
        int left = 0;
        int right = matrix[matrixArrayIndex].length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[matrixArrayIndex][right] < target) {
                matrixArrayIndex++;
                if (matrixArrayIndex == matrix.length) {
                    return false;
                }
                continue;
            }
            if (matrix[matrixArrayIndex][mid] == target) {
                return true;
            }
            else if (matrix[matrixArrayIndex][mid] > target) {
                right = mid - 1;
            }
            else if (matrix[matrixArrayIndex][mid] < target) {
                left = mid + 1;
            }
        }
        return false;
    }
}
