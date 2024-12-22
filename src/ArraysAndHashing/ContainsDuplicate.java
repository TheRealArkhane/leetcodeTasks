package ArraysAndHashing;


// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
// https://neetcode.io/problems/duplicate-integer

import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        System.out.println(containsDuplicate(nums));
    }
}
