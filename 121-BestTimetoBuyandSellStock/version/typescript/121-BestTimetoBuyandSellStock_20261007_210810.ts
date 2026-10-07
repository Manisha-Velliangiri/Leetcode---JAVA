// Last updated: 10/7/2026, 9:08:10 PM
1function maxProfit(prices: number[]): number {
2    
3    let buy = 0;
4    let sell =1;
5    let ans = 0;
6
7   while(sell<prices.length){
8        
9       if(prices[buy]<prices[sell]){
10         const currProfit = prices[sell]-prices[buy];
11         ans = Math.max(currProfit,ans);
12       }else{
13          buy=sell;
14       }
15       sell++;
16     
17   }
18     return ans;
19};