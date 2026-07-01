// Last updated: 7/1/2026, 11:05:45 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        
4
5        int[] fs1 = new int[26];
6        int[] freq = new int[26];
7
8        
9
10        for(int i=0;i<s1.length();i++){
11            
12            fs1[s1.charAt(i)-'a']++;
13        }
14
15        int left=0;
16        for(int right=0;right<s2.length();right++){
17                 
18               freq[s2.charAt(right)-'a']++;
19
20               int window = right - left + 1;
21
22               if(window > s1.length()){
23                   freq[s2.charAt(left)-'a']--;
24                   left++;
25                   window = right - left + 1;
26               }
27               if(window == s1.length() && Arrays.equals(fs1,freq)){
28
29                  return true;
30               }
31
32        }
33        return false;
34    }
35}