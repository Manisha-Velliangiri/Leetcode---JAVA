// Last updated: 6/1/2026, 10:54:43 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        
4        int minLen =Integer.MAX_VALUE;
5        int sum=0;
6        int left=0;
7
8        for(int right=0;right<nums.length;right++){
9
10            sum += nums[right];
11
12            while(sum>=target){
13
14                minLen = Math.min(minLen , right-left+1);
15
16                sum -= nums[left];
17                left++;
18            }
19        }
20
21       if(minLen == Integer.MAX_VALUE){
22        return 0;
23       }
24       return minLen;
25
26    }
27}