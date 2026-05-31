// Last updated: 5/31/2026, 11:00:15 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        
4        int max = Integer.MIN_VALUE;
5
6        int i=0;
7
8       while(i<=nums.length-k){
9
10             int curr = 0;
11
12        for(int j=i;j<k+i;j++){
13             
14             curr += nums[j];
15        }
16        if(curr>max){
17                max = curr;
18             }
19        i++;
20       }
21       return (double) max/k;
22    }
23}