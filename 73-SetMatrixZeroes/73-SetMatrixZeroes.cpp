// Last updated: 7/22/2025, 3:15:07 PM
// Better solution
class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        //creating arr to keep track of zeros
        int m=matrix.size();
        int n=matrix[0].size();

        
        vector<char> col(n,0);
        vector<char> row(m,0);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]='*';
                    col[j]='*';
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]=='*' || col[j]=='*'){
                    matrix[i][j]=0;
                }
            }
        }

    }
};