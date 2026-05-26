// Last updated: 5/26/2026, 9:52:36 PM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        
4
5        int i=0;
6        int count=0;
7        for(int j=0;j<nums.length;j++){
8
9            if(nums[j]!=val){
10
11                nums[i]=nums[j];
12                i++;
13                count++;
14            }
15        }
16        return count;
17    }
18}