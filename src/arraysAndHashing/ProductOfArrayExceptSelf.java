package arraysAndHashing;

//Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].
//Each product is guaranteed to fit in a 32-bit integer.
//Follow-up: Could you solve it in O(n) time without using the division operation?

//Example 1:
//Input: nums = [1,2,4,6]
//Output: [48,24,12,8]

//Example 2:
//Input: nums = [-1,0,1,2,3]
//Output: [0,-6,0,0,0]

//Constraints:
//2 <= nums.length <= 1000
//-20 <= nums[i] <= 20
//https://neetcode.io/problems/products-of-array-discluding-self

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 0, 1, 2, 3})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for (int num : nums) {
            if (num != 0) product *= num;
            else zeroCount++;
        }

        if (zeroCount > 1) {
            return new int[nums.length];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                result[i] = (nums[i] == 0) ? product : 0;
            } else {
                result[i] = product / nums[i];
            }
        }
        return result;
    }
}
