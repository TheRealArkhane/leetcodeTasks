package twoPointers;

/*
You are given an integer array heights where heights[i] represents the height of the
i-th bar.
You may choose any two bars to form a container. Return the maximum amount of water a container can store.

Example 1;
Input: height = [1,7,2,5,4,7,3,6]
Output: 36

Example 2:
Input: height = [2,2,2]
Output: 4

Constraints:
2 <= height.length <= 1000
0 <= height[i] <= 1000
https://neetcode.io/problems/max-water-container
 */

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,7,2,5,4,7,3,6}));
    }

    public static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(heights[left], heights[right]));
            if (heights[left] <= heights[right]) {
                left++;
                continue;
            }
            if (heights[right] <= heights[left]) {
                right--;
            }
        }
        return maxArea;
    }
}
