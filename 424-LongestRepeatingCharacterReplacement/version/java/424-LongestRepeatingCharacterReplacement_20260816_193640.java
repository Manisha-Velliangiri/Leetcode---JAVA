// Last updated: 8/16/2026, 7:36:40 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        
4        int freq[] = new int[26];
5        int max =0;
6        int maxFreq = 0;
7        
8        int right =0;
9        int left =0;
10
11        while(right<s.length()){
12           
13           char curr = s.charAt(right);
14
15           freq[curr-'A']++;
16           
17           maxFreq = Math.max(maxFreq ,freq[curr-'A']);
18
19           int window = right - left +1;
20
21           if(window - maxFreq > k){
22            freq[s.charAt(left) - 'A']--;
23              left++;
24           }
25            window = right - left +1;
26           max = Math.max(max ,window);
27           right++;
28        }
29        return max;    
30    }
31}