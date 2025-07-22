// Last updated: 7/22/2025, 3:14:46 PM
class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int sum2=0;
        int n=nums.size();
        int sum=(n*(n+1)/2);
        for(int i=0;i<nums.size();i++){
            sum2+=nums[i];
        }
        return sum-sum2;
    }
};