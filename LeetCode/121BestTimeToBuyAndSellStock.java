//https://leetcode.com/problems/best-time-to-buy-and-sell-stock


// time complexity O(n), space complexity O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int maxProfit = 0;       
        for(int sell = 1; sell < prices.length; sell++){
            if(prices[buy] < prices[sell]){ // check if profitable
                int profit = prices[sell] - prices[buy];
                if(profit > maxProfit) maxProfit = profit;
            } else {
                buy = sell;
            }
        }
        return maxProfit;

    }
}