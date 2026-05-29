// Last updated: 5/29/2026, 5:35:14 PM
1class Solution {
2    public int maxArea(int[] height) {
3        
4        int max = 0;
5        int i=0;
6        int j = height.length-1;
7
8        while(i<j){
9
10             int area= Math.min(height[i],height[j])*(j-i);
11             
12             max = Math.max(area,max);
13
14             if(height[i]<height[j]){                 
15                 i++;
16             }else{   
17                 j--;
18             }
19        }
20        return max;
21    }
22}