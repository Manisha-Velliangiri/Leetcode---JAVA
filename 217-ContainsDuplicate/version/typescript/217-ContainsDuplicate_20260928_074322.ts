// Last updated: 9/28/2026, 7:43:22 AM
1function containsDuplicate(nums: number[]): boolean {
2    
3    const keep = new Map<number,boolean>();
4
5    for(let i=0;i<nums.length;i++){
6        
7        if(keep.has(nums[i])){
8            return true;
9        }else{
10            keep.set(nums[i],true);
11        }
12    }
13
14   return false;
15    
16};