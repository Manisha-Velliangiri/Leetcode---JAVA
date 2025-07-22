// Last updated: 7/22/2025, 3:14:18 PM
class Solution {
public:
    int waysToSplitArray(vector<int>& nums) {
        long long total=0;
        int count=0;
        for(int i=0;i<nums.size();i++){
            total+=nums[i];
        }
         long long temp=0;
        for(int i=0;i<nums.size()-1;i++){
             temp+=nums[i];
              long long remaining = total-temp;
            if(temp>=remaining){
                count++;
                
            }
        }
        return count;
    }
};