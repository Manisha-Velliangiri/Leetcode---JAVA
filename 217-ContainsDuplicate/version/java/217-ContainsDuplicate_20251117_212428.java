// Last updated: 11/17/2025, 9:24:28 PM
class Solution {
    public int maxProfit(int[] prices) {
        
        int n= prices.length;
         int minprice=prices[0];
         int maxprofit=0;

        for(int i=1;i<n;i++){
           
           int profit=prices[i]-minprice;
           
           maxprofit= Math.max(maxprofit,profit);
           minprice=Math.min(minprice,prices[i]);
           

        }
        return maxprofit;
    }
}