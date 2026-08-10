// Last updated: 8/10/2026, 10:37:38 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        
4        HashSet<Character> map = new HashSet<>();
5
6        int left =0;
7        int count =0;
8      
9         for(int right =0;right<s.length();right++){
10             
11              char curr = s.charAt(right);
12
13              while(map.contains(curr)){
14                
15                map.remove(s.charAt(left));
16                left++;
17              }
18               map.add(curr);
19               count = Math.max( count , right-left+1);
20             
21         }
22         return count ;
23    }
24}
25