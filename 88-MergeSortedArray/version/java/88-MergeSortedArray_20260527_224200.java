// Last updated: 5/27/2026, 10:42:00 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        
4
5        int i = m-1;
6        int j = n-1;
7        int k = m+n-1;
8        
9       while(j>=0){
10           if(i<0 || nums2[j]>=nums1[i]){
11                  nums1[k]=nums2[j];
12                  j--;
13                  k--;
14            }else if(nums1[i]>=nums2[j]){
15                nums1[k]=nums1[i];
16                i--;
17                k--;
18            }
19       }
20    }
21}