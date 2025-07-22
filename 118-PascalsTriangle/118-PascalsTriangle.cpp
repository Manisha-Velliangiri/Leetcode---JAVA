// Last updated: 7/22/2025, 3:14:58 PM
class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        // constructing a arr[arr] acc to the ans, to keep track of the arrays

        vector<vector<int>>ans;
        // ok now iterating the rows

        for(int i=0;i<numRows;i++){
            // creating an arrays which keeps track of the modified value for each row
            //this arr holds values for each row
            // i+1=size and we fill it with 1 for now
            vector<int>rows(i+1,1);
            //ok now we take j to iterate over every row,
            // at j=0,we dont have any prev number for it ,so we cannot add, so take it from j=1
            for(int j=1;j<i;j++){

                rows[j]=ans[i-1][j]+ans[i-1][j-1];

            }
            ans.push_back(rows);
        }
        return ans;
    }
    
};