package slidingWindow;


/*
You are given an integer array prices where prices[i] is the price of NeetCoin on the ith day.
You may choose a single day to buy one NeetCoin and choose a different day in the future to sell it.
Return the maximum profit you can achieve. You may choose to not make any transactions, in which case the profit would be 0.

Example 1:
Input: prices = [10,1,5,6,7,1]
Output: 6
Explanation: Buy prices[1] and sell prices[4], profit = 7 - 1 = 6.

Example 2:
Input: prices = [10,8,7,5,2]
Output: 0
Explanation: No profitable transactions can be made, thus the max profit is 0.

Constraints:
1 <= prices.length <= 100
0 <= prices[i] <= 100
 */

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2,4}));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;
        while (left < prices.length - 1) {
            if (prices[left] > prices[right]) {
                left = right;
                right++;
                continue;
            }
            if (maxProfit < (prices[right] - prices[left])) {
                maxProfit = prices[right] - prices[left];
            }
            if (right >= prices.length - 1) {
                left++;
                right = left + 1;
            }
            else right++;
        }
        return maxProfit;
    }
}
