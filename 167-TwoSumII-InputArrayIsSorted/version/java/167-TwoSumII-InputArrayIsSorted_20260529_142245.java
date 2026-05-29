// Last updated: 5/29/2026, 2:22:45 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        
4
5        int i=0;
6        int j = numbers.length-1;
7        
8
9        while(i<j){
10           
11           if(numbers[i]+numbers[j]>target){
12               j--;
13           }else if(numbers[i]+numbers[j]<target){
14               i++;
15           }else{
16               
17                return new int[]{i+1,j+1};
18              
19           }
20        }
21        return new int[]{};
22    }
23}