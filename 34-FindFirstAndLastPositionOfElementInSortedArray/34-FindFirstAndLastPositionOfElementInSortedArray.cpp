// Last updated: 7/22/2025, 3:15:15 PM
class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int>ans(2,-1);

        int low=0;
        int high=nums.size()-1;
//lowerbound
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
//upperbound
       
      low=0;
         high=nums.size()-1;
        while(low<=high){
             int mid=(low+high)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        
        }
        return ans;
    }
};