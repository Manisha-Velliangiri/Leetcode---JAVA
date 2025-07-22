// Last updated: 7/22/2025, 3:14:30 PM
class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        string s1="";
        string s2="";
//in strings the order doesnt matter
        for(const string& s:word1)
          s1+=s;
        for(const string& s:word2)
          s2+=s;

        return s1==s2;
    }
};