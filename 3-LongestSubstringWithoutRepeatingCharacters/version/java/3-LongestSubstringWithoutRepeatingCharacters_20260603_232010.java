// Last updated: 6/3/2026, 11:20:10 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        
4        HashSet<Character> set = new HashSet<>();
5
6        int left=0;
7        int max = 0;
8
9        for(int right=0;right<s.length();right++){
10
11            while(set.contains(s.charAt(right))){
12                set.remove(s.charAt(left));
13                left++;
14            }
15            set.add(s.charAt(right));
16            max = Math.max(max,right-left+1);
17
18            
19        }
20        return max;
21    }
22}