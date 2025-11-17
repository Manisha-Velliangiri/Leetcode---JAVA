// Last updated: 11/17/2025, 8:15:38 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;

        
        for(int i=0;i<n;i++){
            
            int findnum = target-nums[i];

            for(int j=i+1;j<n;j++){
                if(nums[j]==findnum){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}