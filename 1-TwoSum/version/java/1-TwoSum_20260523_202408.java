// Last updated: 5/23/2026, 8:24:08 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        
4        HashMap<Integer , Integer> map = new HashMap<>();
5      
6
7        for(int i=0;i<nums.length;i++){
8        
9            int remaining = target-nums[i];
10
11            if(map.containsKey(remaining)){
12                return new int[]{map.get(remaining),i};
13            }
14
15            map.put(nums[i],i);
16        }
17        return new int[]{};
18        
19    }
20}
21
22
23