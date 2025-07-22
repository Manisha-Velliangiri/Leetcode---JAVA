// Last updated: 7/22/2025, 3:14:55 PM
class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size()==0){
            return 0;
        }

        sort(nums.begin(),nums.end());
        int count=0;
        int lastSmaller=INT_MIN;
        int longest=1;

        for(int i=0;i<nums.size();i++){
            if(nums[i]-1==lastSmaller){
                count++;
                lastSmaller=nums[i];
            }
            else if(lastSmaller!=nums[i]){
                count=1;
                lastSmaller=nums[i];
            }
            longest=max(longest,count);
        }
        return longest;
       
    }
};