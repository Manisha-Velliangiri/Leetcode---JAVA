// Last updated: 7/22/2025, 3:15:08 PM
class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {

        for(int i=digits.size()-1;i>=0;i--){
            if(digits[i]+1<10){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        vector<int>ndigits(digits.size()+1);
        ndigits[0]=1;
        return ndigits;
    }
};