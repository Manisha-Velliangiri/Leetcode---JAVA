// Last updated: 7/22/2025, 3:15:09 PM
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        
        //sorting them so that they r easy to overlap
        sort(intervals.begin(),intervals.end());
        //arrr to store the ans
        vector<vector<int>>ans;

        for(int i=0;i<intervals.size();i++){
        // so for 2 to overlap ex  1,3  and 2,6
        // 3>2  to overlap. so if not then t means there is no overlap
        //if the ans arr is empty  or [ ,ele] < [ele, ] -> no overlap add the interval
            if(ans.empty() || ans.back()[1]<intervals[i][0]){
                ans.push_back(intervals[i]);
            }
            else{
                // if overlap detected, then merge them
                ans.back()[1]= max(intervals[i][1],ans.back()[1]);
            }
        }
        return ans;
    }
};