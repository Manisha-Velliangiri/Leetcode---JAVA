// Last updated: 5/28/2026, 2:56:33 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        
4     int n= nums.length;
5     int[] answer = new int[n];
6     int posi = n-1;
7
8     int j=n-1;
9     int i=0;
10     
11     while(i<=j){
12         
13         int isq = nums[i]*nums[i];
14         int jsq = nums[j]*nums[j];
15
16         if(jsq > isq){
17
18            answer[posi]=jsq;
19            posi--;
20            j--;
21         }else{
22            answer[posi]=isq;
23            i++;
24            posi--;
25         }
26     }
27     return answer;
28    }
29}