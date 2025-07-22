// Last updated: 7/22/2025, 3:14:21 PM
class Solution {
public:
    string shiftingLetters(string s, vector<vector<int>>& shifts) {
        int n = s.length();
        vector<int> prefix(n + 1, 0); 

        for (auto &shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int dir = shift[2];
            prefix[start] += (2 * dir - 1);
            prefix[end + 1] -= (2 * dir - 1);
        }


        int currentShift = 0;
        for (int i = 0; i < n; i++) {
            currentShift = (currentShift + prefix[i]) % 26;
            s[i] = 'a' + (s[i] - 'a' + currentShift + 26) % 26; 
        }

        return s;
    }
};