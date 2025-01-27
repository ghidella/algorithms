// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            int potentialProfit = currentPrice - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
            minPrice = Math.min(minPrice, currentPrice);
        }
        return maxProfit;        
    }
}