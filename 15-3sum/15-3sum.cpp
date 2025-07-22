// Last updated: 7/22/2025, 3:15:22 PM
      
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
      vector<vector<int>> triplets;
        sort(nums.begin(), nums.end());
        set<vector<int>> no_duplicate; 
        for (int i=0; i < nums.size(); i++){
            int l = i + 1;
            int r = nums.size() - 1;
            while (r > l){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0){
                    r--;
                } else if (sum < 0){
                    l++;
                } else {
                    vector<int> sub_ans {nums[i], nums[l], nums[r]};
                    no_duplicate.insert(sub_ans);
                    r--;
                    l++;
                }
            }
        }
        for (auto begin = no_duplicate.begin(); begin != no_duplicate.end(); begin++){
            triplets.push_back(*begin);
        }
        return triplets;  
    }
};