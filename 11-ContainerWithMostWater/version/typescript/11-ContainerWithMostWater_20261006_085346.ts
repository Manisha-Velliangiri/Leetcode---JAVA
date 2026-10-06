// Last updated: 10/6/2026, 8:53:46 AM
1function maxArea(height: number[]): number {
2    
3    let ans = 0;
4
5    let left = 0;
6    let right = height.length-1;
7
8    while(left<right){
9        
10        const width = right-left;
11        const currLength = Math.min(height[left],height[right]);
12        const total = width*currLength;
13         ans = Math.max(total,ans)
14
15        if(height[left]<height[right]){
16            left++;
17
18        }else {
19            right--;
20        }
21
22    }
23    return ans;
24};