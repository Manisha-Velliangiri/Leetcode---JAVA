// Last updated: 9/25/2026, 11:02:11 PM
1function twoSum(nums: number[], target: number): number[] {
2    
3
4    const keep = new Map<number,number>();
5
6    for(let i=0;i<nums.length;i++){
7
8        const curr = nums[i];
9
10        let diff = target - curr;
11
12        if(keep.has(diff)){
13            return [keep.get(diff)!,i];
14        }
15
16        keep.set(curr,i);
17    }
18};