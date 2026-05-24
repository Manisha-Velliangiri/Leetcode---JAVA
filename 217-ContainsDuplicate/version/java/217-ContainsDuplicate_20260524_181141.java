// Last updated: 5/24/2026, 6:11:41 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        
4
5        HashSet<Integer> set = new HashSet<>();
6
7        for(int i=0;i<nums.length;i++){
8            
9            if(set.contains(nums[i])){
10                return true;
11            }
12            set.add(nums[i]);
13        }
14        return false;
15    }
16}