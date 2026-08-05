// Last updated: 8/5/2026, 7:34:49 AM
1class Solution {
2    public int maxArea(int[] height) {
3        
4        int i=0;
5        int j=height.length-1;
6
7        int maxHeight =0;
8        int distance =0;
9
10        int maxWater =0;
11        int ans =0;
12
13        while(i<j){
14            
15           maxHeight= Math.min(height[i],height[j]);
16           distance = j-i;
17           maxWater = maxHeight*distance;
18          
19           if(height[i]<height[j]){
20              i++;
21           }else{
22             j--;
23           }
24
25           ans = Math.max(maxWater , ans);
26
27        }
28        return ans;
29    }
30}