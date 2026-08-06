// Last updated: 8/6/2026, 8:56:34 AM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        
4        Set<List<Integer>> ans = new HashSet<>();
5        Arrays.sort(nums);
6
7        for(int i=0;i<nums.length;i++){
8            int left = i+1;
9            int right = nums.length-1;
10
11            while(left<right){
12            
13            int sum = nums[i]+nums[left]+nums[right];
14
15            if(sum==0){
16                  ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
17                  left++;
18                  right--;
19            }else if(sum<0){
20                left++;
21            }else{
22                right --;
23            }
24          }
25        }
26        return new ArrayList<>(ans);
27    }
28}