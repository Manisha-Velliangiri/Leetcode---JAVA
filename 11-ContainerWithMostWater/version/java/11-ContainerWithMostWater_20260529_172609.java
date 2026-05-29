// Last updated: 5/29/2026, 5:26:09 PM
1class Solution {
2    public int maxArea(int[] height) {
3        
4        int max = 0;
5
6        int i=0;
7        int j = height.length-1;
8
9        while(i<j){
10
11             int area= Math.min(height[i],height[j])*(j-i);
12             
13             max = Math.max(area,max);
14
15             if(height[i]<height[j]){                 
16                 i++;
17             }else{   
18                 j--;
19             }
20        }
21        return max;
22    }
23}