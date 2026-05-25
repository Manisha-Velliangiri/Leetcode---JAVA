// Last updated: 5/25/2026, 11:45:59 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        
4        int i=0;
5
6        for(int j=0;j<nums.length;j++){
7
8            if(nums[j]!=0){
9                nums[i]=nums[j];
10                i++;
11            }
12        }
13        while(i<nums.length){
14            nums[i]=0;
15            i++;
16        }
17    }
18}
19