// Last updated: 6/30/2026, 11:31:08 PM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        
4
5        int[] freq = new int[26];
6        int[] pfreq = new int[26];
7
8        List<Integer> ans = new ArrayList<>();
9
10        if(p.length()>s.length()){
11            return ans;
12        }
13
14
15        for(int i=0;i<p.length();i++){
16
17            pfreq[p.charAt(i)-'a']++;
18        }
19
20        int left =0;
21        for(int right=0;right<s.length();right++){
22             
23             freq[s.charAt(right)-'a']++;
24             int window = right - left +1;
25
26            if(window>p.length()){
27
28                freq[s.charAt(left)-'a']--;
29                left++;
30                window = right - left + 1;
31            }
32            if(window == p.length() && Arrays.equals(freq,pfreq)){
33
34                ans.add(left);
35            }
36              
37
38        }
39        return ans;
40    }
41}