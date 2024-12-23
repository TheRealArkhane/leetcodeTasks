package arraysAndHashing;

//Given an integer array nums and an integer k, return the k most frequent elements within the array.
//The test cases are generated such that the answer is always unique.
//You may return the output in any order.

//Example 1:
//Input: nums = [1,2,2,3,3,3], k = 2
//Output: [2,3]

//Example 2:
//Input: nums = [7,7], k = 1
//Output: [7]

//Constraints:
//1 <= nums.length <= 10^4.
//-1000 <= nums[i] <= 1000
//1 <= k <= number of distinct elements in nums.
//https://neetcode.io/problems/top-k-elements-in-list

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{7, 7}, 1)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return map
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(Map.Entry::getKey)
                .limit(k)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
