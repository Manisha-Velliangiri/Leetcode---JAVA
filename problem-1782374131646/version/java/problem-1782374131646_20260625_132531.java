// Last updated: 6/25/2026, 1:25:31 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        
4        int totalSum= 0;
5        for(int i=0;i<nums.length;i++){
6            totalSum+=nums[i];
7        }
8        
9       
10        int currSum =0;
11        for(int i=0;i<nums.length;i++){
12           
13
14             int rightSum = totalSum - currSum - nums[i];
15             if(rightSum == currSum){
16                   return i;
17              }
18               currSum+=nums[i];
19            
20        }
21        return -1;
22    }
23}