// Last updated: 8/9/2026, 7:39:31 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        
4       int minPrice = prices[0];
5       int profit = 0;
6       
7       for(int i=0;i<prices.length;i++){
8          
9          minPrice = Math.min(minPrice,prices[i]);
10          
11          int currProfit = prices[i]-minPrice;
12
13          profit = Math.max(currProfit , profit);
14
15       }
16       return profit;
17    }
18    
19}