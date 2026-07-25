// Last updated: 7/25/2026, 1:50:13 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        
4        int n = nums.length;
5
6        int[] left = new int[n];
7        int[] right = new int[n];
8
9         left[0]=1;
10        for(int i=1;i<n;i++){
11
12            left[i]=left[i-1]*nums[i-1];
13        }
14
15         right[n-1]=1;
16        for(int i=n-2;i>-1;i--){
17            
18            right[i] = right[i+1]*nums[i+1];
19        }
20
21        int[] ans = new int[n];
22        for(int i=0;i<n;i++){
23            ans[i]=left[i]*right[i];
24        }
25        return ans;
26
27    }
28}