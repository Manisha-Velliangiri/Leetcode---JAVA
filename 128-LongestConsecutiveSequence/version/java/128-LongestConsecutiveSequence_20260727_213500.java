// Last updated: 7/27/2026, 9:35:00 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        
4       
5        if( nums.length==0){
6            return 0;
7        }
8        Arrays.sort(nums);
9         
10        int max =1;
11        int count =1;
12
13        for(int i=0;i<nums.length-1;i++){
14             
15             int diff = nums[i+1]-nums[i];
16
17            if(diff==1){
18                count++;
19
20            }else if(diff>1){
21                count =1;
22            }
23             max = Math.max(max,count);
24        }
25        return max;
26    }
27      
28}