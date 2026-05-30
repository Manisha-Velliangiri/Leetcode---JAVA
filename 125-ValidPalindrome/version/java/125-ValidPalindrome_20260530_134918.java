// Last updated: 5/30/2026, 1:49:18 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        
4         s = s.toLowerCase();
5        int i=0;
6        int j =s.length()-1;
7
8
9        while(i<j){
10
11            if(!Character.isLetterOrDigit(s.charAt(i))){
12                i++;
13            }else if(!Character.isLetterOrDigit(s.charAt(j))){
14                j--;
15            }else if(s.charAt(i) != s.charAt(j)){
16                return false;
17            }else{
18                i++;
19                j--;
20            }
21           
22        }
23        return true;
24
25        
26
27    }
28}