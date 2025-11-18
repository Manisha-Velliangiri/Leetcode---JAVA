// Last updated: 11/18/2025, 8:22:19 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        
       int ans=0;

        for(int i=0;i<nums.length;i++){
             int currsum=0;
            for(int j=i;j<nums.length;j++){
 
                currsum+=nums[j];

                if(currsum==k){
                    ans++;
                    
                }
                
            }
        }
        return ans;
    }
}