// Last updated: 7/22/2025, 3:14:27 PM
class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
        vector<int>ans;
        for(int i=0;i<nums.size();i++){
            ans.push_back(nums[nums[i]]);
        }
        return ans;
    }
};