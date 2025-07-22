// Last updated: 7/22/2025, 3:15:18 PM
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n=nums.size();
        int index=-1;

        // we r looping through to find a dip. means where the arr[i]<arr[i+1]
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                //so if we find the dip, then we r marking the index and breaking out of the loop.
                index=i;
                break;
            }
        }
        // if we dind;t find any dip, means the arr is in last perm already
        // so we reverse it and give the 1st perm as ans
        if(index==-1){
            reverse(nums.begin(),nums.end());
            return;
        }
        
        // so now we found the dip, example [2 1 5 4 3 0 0] ,the dip will be at 1 5
        //so now we know after 5 however we rearrange the number as whole will be less then origi number
        // we need next perm -> means something that is slightly larger not the largest

        // so now we have only one place where we can achieve this that is 2 1 5
        // so if we change the posi of 1 to [2 3 5 4 1 0 0]
        //here we have found a number greater than 1 . slightly that is 3.[only consi numbers after the dip]
        //so now since 2 3 is found whatever given after this does not affect the number, but still we need the smallest possible
        // so after 2 3 we reverse the remaining numbers. => 0 0 1 4 5
        // then we get => 2 3 0 0 1 4 5


        //now we have to find slightly smallest num than the index
        for(int i=n-1;i>index;i--){
             if(nums[i]>nums[index]){
                swap(nums[index],nums[i]);
                break;
             }
        }

        //ok now reverse the remaing ele
        //means , reverse from the index[dip] to end of the array
        reverse(nums.begin()+index+1,nums.end());
    }
};