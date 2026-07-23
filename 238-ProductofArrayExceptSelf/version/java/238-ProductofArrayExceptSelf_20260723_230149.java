// Last updated: 7/23/2026, 11:01:49 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        
4        int n=nums.length;
5        
6        int[] left = new int[n];
7        int[] right = new int[n];
8
9        left[0]=1;
10        for(int i=1;i<n;i++){
11           left[i]=left[i-1]*nums[i-1];
12        }
13
14        right[n-1]=1;
15        for(int i=n-2;i>-1;i--){
16            right[i]=right[i+1]*nums[i+1];
17        }
18
19        int[]  ans=new int[n];
20        for(int i=0;i<n;i++){
21            ans[i]=left[i]*right[i];
22        }
23
24        return ans;
25    }
26}