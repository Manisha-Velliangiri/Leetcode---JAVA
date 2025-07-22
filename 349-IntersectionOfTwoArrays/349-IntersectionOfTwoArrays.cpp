// Last updated: 7/22/2025, 3:14:42 PM
class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
         sort(nums1.begin(),nums1.end());
         sort(nums2.begin(),nums2.end());

         vector<int>ans;
         set<int>s;
         int i=0;
         int j=0;
         while(i<nums1.size() && j<nums2.size()){
            if(nums1[i]==nums2[j]){
                s.insert(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
         }
        for (auto i:s){
             ans.push_back(i);
             
         }
         return ans;

    
    }
    
};