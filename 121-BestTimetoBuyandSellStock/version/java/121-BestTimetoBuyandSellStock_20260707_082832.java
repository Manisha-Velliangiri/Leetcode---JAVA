// Last updated: 7/7/2026, 8:28:32 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        
4
5        int minPrice = prices[0];
6        int maxProfit = 0;
7
8        for(int i=0;i<prices.length;i++){
9
10            minPrice = Math.min(minPrice,prices[i]);
11
12            int profit = prices[i]-minPrice;
13
14            maxProfit = Math.max(profit,maxProfit);
15        }
16
17        return maxProfit;
18
19    }
20}