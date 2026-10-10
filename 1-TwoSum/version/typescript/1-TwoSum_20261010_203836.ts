// Last updated: 10/10/2026, 8:38:36 PM
1function twoSum(nums: number[], target: number): number[] {
2    
3    const keep = new Map<number,number>();
4
5    for(let i=0;i<nums.length;i++){
6       
7       const currSum = target - nums[i];
8
9       if(keep.has(currSum)){
10        return [i , keep.get(currSum)!];
11       }
12
13       keep.set(nums[i],i);
14    }
15};