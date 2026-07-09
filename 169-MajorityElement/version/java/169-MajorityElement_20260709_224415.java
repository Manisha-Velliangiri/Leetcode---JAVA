// Last updated: 7/9/2026, 10:44:15 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        
4        HashMap<Integer,Integer> freq = new HashMap<>();
5
6        for(int i=0;i<nums.length;i++){
7
8            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
9        }
10        int ans = 0;
11        int maxFreq = 0;
12        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
13             
14            if(entry.getValue()>maxFreq){
15                maxFreq = entry.getValue();
16                ans = entry.getKey();
17            }
18    
19        }
20        return ans;
21    }
22}