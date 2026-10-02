// Last updated: 10/2/2026, 11:57:51 PM
1function longestConsecutive(nums: number[]): number {
2    
3    const ansSet = new Set<number>(nums);
4    let longestStreak = 0;
5
6    for(const curr of ansSet){
7        
8
9        if(!ansSet.has(curr-1)){
10           let currStreak = 1;
11           let nextNum = curr+1;
12
13           while(ansSet.has(nextNum)){
14             currStreak++;
15             nextNum++;
16           }
17
18           longestStreak = Math.max(longestStreak , currStreak);
19        }
20    } 
21    return longestStreak;
22};