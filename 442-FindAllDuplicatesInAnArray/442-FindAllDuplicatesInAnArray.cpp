// Last updated: 7/22/2025, 3:14:39 PM
class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
         unordered_map<int,int>count;
         vector<int>ans;

         for(int i:nums){
            if(count[i]==1){
                ans.push_back(i);
            }
            count[i]++;
         }
         return ans;
    }
};