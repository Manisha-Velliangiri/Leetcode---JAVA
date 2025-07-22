// Last updated: 7/22/2025, 3:14:34 PM
class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int,int>count;
        unordered_map<int,int>freq;

        for(int i:arr){
            count[i]++;
        }
//for every number u find on count. add the freq 
        for(auto entry:count){
            freq[entry.second]++;
        }

        for(auto entry:freq){
            if(entry.second > 1){
                return false;
            }
        }
        return true;
    }
};