// Last updated: 9/30/2026, 7:56:52 PM
1function productExceptSelf(nums: number[]): number[] {
2    
3   let leftProduct = 1;
4   const ans = new Array(nums.length);
5
6   for(let i=0;i<nums.length;i++){
7       
8       ans[i] = leftProduct;
9       leftProduct *=nums[i];
10   }
11
12   let rightProduct =1;
13   for(let i=nums.length-1;i>=0;i--){
14      
15      ans[i]  = ans[i]*rightProduct;
16      rightProduct *=nums[i];
17   }
18   return ans;
19};