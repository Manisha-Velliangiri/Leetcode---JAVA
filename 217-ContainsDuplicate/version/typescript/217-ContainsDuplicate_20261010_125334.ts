// Last updated: 10/10/2026, 12:53:34 PM
1function containsDuplicate(nums: number[]): boolean {
2    
3      const seen = new Set<number>();
4     
5      for(let i=0;i<nums.length;i++){
6
7          if(seen.has(nums[i])){
8              return true;
9          }
10
11          seen.add(nums[i]);
12
13      }   
14      return false; 
15};