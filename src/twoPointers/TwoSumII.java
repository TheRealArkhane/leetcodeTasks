package twoPointers;


/*
Given an array of integers numbers that is sorted in non-decreasing order.

Return the indices (1-indexed) of two numbers, [index1, index2],
such that they add up to a given target number target and index1 < index2.
Note that index1 and index2 cannot be equal, therefore you may not use the same element twice.
There will always be exactly one valid solution. Your solution must use O(1) additional space.

Example 1:
Input: numbers = [1,2,3,4], target = 3
Output: [1,2]
Explanation:
The sum of 1 and 2 is 3. Since we are assuming a 1-indexed array, index1 = 1, index2 = 2. We return [1, 2].

Constraints:
2 <= numbers.length <= 1000
-1000 <= numbers[i] <= 1000
-1000 <= target <= 1000
 */

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{-5,-3,0,2,4,6,8}, 5)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            if (left == right) {
                left++;
                right = numbers.length - 1;
                continue;
            }
            if (left == numbers.length - 1) {
                break;
            }
            if (numbers[left] + numbers[right] == target) {
                    result[0] = left + 1;
                    result[1] = right + 1;
                    return result;
            }
            else {
                    right--;
            }
        }
        return result;
    }
}

