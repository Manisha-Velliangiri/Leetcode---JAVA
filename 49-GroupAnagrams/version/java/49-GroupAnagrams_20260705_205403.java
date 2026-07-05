// Last updated: 7/5/2026, 8:54:03 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        
4       
5       int[] freqS = new int[26];
6       int[] freqT = new int[26];
7
8       for(int i=0;i<s.length();i++){
9          
10          freqS[s.charAt(i)-'a']++;
11       }
12
13       for(int i=0;i<t.length();i++){
14
15          freqT[t.charAt(i)-'a']++;
16       }
17       if(Arrays.equals(freqS,freqT)){
18         return true;
19       }
20       return false;
21    }
22    
23}