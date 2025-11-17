// Last updated: 11/17/2025, 8:28:10 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> mapp = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int numneeded = target-nums[i];

            if(mapp.containsKey(numneeded)){
                return new int[]{mapp.get(numneeded),i};
            }
            mapp.put(nums[i],i);
        }
        return new int[]{};
    }
}