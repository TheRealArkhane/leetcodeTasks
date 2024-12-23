package arraysAndHashing;

import java.util.Arrays;

//Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.
//A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element.
//The elements do not have to be consecutive in the original array.
//You must write an algorithm that runs in O(n) time.
//
//Example 1:
//Input: nums = [2,20,4,10,3,4,5]
//Output: 4
//Explanation: The longest consecutive sequence is [2, 3, 4, 5].
//
//Example 2:
//Input: nums = [0,3,2,5,4,6,1,1]
//Output: 7
//
//Constraints:
//0 <= nums.length <= 1000
//-10^9 <= nums[i] <= 10^9

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{2,20,4,10,3,4,5}));
    }

    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int lastResult = 1;
        int result = 1;
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (nums[i + 1] > nums[i] + 1) {
                lastResult = Math.max(lastResult, result);
                result = 1;
                continue;
            }
            if (nums[i + 1] == nums[i] + 1) {
                result++;
            }
        }
        return Math.max(lastResult, result);
    }
}
