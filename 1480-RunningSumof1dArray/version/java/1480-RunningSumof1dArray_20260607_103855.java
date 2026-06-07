// Last updated: 6/7/2026, 10:38:55 AM
1class Solution {
2    public int[] runningSum(int[] nums) {
3        
4        
5       
6            for(int i=1;i<nums.length;i++){
7               
8                nums[i]= nums[i]+nums[i-1];
9            }
10            
11             return nums;
12        }
13       
14        
15    }