// Last updated: 11/20/2025, 12:06:13 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> store = new HashSet<>();

        for(int i=0;i<nums.length;i++){

            if(store.contains(nums[i])){
                return true;
            }
            store.add(nums[i]);
        }
        return false;
    }
}