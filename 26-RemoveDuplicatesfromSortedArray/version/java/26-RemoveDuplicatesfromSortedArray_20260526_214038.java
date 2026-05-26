// Last updated: 5/26/2026, 9:40:38 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        
4
5        int i=0;
6        int count=1;
7
8        for(int j=i+1;j<nums.length;j++){
9            if(nums[j]!=nums[i]){
10                i++;
11                count++;
12                nums[i]=nums[j];
13            }
14        }
15        return count;
16    }
17}