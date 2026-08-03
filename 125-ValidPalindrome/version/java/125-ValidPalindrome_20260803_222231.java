// Last updated: 8/3/2026, 10:22:31 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        
4      s = s.toLowerCase();
5
6      int left = 0;
7      int right = s.length()-1;
8
9      while(left < right){
10           
11           if(!Character.isLetterOrDigit(s.charAt(left))){
12            left++;
13           }
14           else if (!Character.isLetterOrDigit(s.charAt(right))){
15            right--;
16           }
17           else if(s.charAt(left)!=s.charAt(right)){
18             return false;
19           }
20           else{
21              left++;
22              right--;
23           }
24           
25      }
26      return true;
27}
28}