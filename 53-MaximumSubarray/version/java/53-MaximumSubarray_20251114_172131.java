// Last updated: 11/14/2025, 5:21:31 PM
class Solution {
    public int maxSubArray(int[] nums) {

        int n=nums.length;

        int currsum =0;
        int maxsum=nums[0];

        for(int i=0;i<n;i++){
            
            currsum+=nums[i];
            maxsum=Math.max(currsum,maxsum);

            if(currsum<0){
               
                currsum=0;
            }

        }
        return maxsum;
    }
}