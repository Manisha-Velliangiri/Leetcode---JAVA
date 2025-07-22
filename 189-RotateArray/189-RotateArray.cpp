// Last updated: 7/22/2025, 3:14:49 PM
class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n=nums.size();
         k= k % n;
        //so for example arr size is 7
        //7 means. we r rev the whole arr + 2 for 9 
        //we have to rotate 9 posi => 7+2 > n+2
        // 9 % 7 is 2 . so it will return 2 rotations
         
         //  1,2,3,4,5,6,7
        // => 7,6,5,4,3,2,1
        reverse(nums.begin(),nums.end());
        //rev k ele
        // till k position =3 [3rd ele,not 3rd index]
        // 5,6,7,4,3,2,1
        reverse(nums.begin(),nums.begin()+k);
        //rev remaining
        // 5,6,7,1,2,3,4
        reverse(nums.begin()+k,nums.end());
    }
};