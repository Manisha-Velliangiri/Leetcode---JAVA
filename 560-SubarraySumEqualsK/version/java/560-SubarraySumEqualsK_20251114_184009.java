// Last updated: 11/14/2025, 6:40:09 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int n=nums.length;
        int count=0;
        

        for(int i=0;i<n;i++){
            int currsum=0;
            for(int j=i;j<n;j++){
                currsum+=nums[j];
                if(currsum==k){
                    count++;
                }
            }
 
        }
        return count;
    }
}