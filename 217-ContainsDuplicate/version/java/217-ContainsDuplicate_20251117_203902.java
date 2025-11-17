// Last updated: 11/17/2025, 8:39:02 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set= new HashSet<>();

        for(int i=0;i<nums.length;i++){

            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}