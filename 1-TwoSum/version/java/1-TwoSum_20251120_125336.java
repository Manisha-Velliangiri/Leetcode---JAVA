// Last updated: 11/20/2025, 12:53:36 PM
class Solution {
    public int maxSubArray(int[] nums) {
        

        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            
            currsum+=nums[i];
            maxsum=Math.max(maxsum,currsum);
            if(currsum<0){
                currsum=0;
            }

        }
        return maxsum;
    }
}