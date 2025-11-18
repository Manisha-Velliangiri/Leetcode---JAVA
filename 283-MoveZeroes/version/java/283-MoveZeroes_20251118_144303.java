// Last updated: 11/18/2025, 2:43:03 PM
class Solution {
    public void moveZeroes(int[] nums) {
        
    
        int j=0;

        for(int i=0;i<nums.length;i++){
          
                if(nums[i]!=0){
                   
                   int temp=nums[i];
                   nums[i]=nums[j];
                   nums[j]=temp;

                   j++;
                }

        }
    }
}