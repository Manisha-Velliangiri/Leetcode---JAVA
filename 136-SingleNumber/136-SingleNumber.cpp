// Last updated: 7/22/2025, 3:14:54 PM
class Solution {
public:
    int singleNumber(vector<int>& nums) {
       int ans=0;
       //using xor function ,
       //saying for every x in nums do xor
       for(auto x:nums)
       ans^=x;
       return ans;
    }
};
// time- o(N)  space-o(1)
//refer notes for ur own ans
// whenever there is a missing ele,one to find always use xor