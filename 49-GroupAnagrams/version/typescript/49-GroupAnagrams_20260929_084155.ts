// Last updated: 9/29/2026, 8:41:55 AM
1function groupAnagrams(strs: string[]): string[][] {
2    
3    const keep = new Map();
4
5    for(let i=0;i<strs.length;i++){
6
7        const origi = strs[i];
8
9        const sorted = origi.split('').sort().join('');
10
11        if(!keep.has(sorted)){
12            keep.set(sorted,[]);
13        }
14
15        keep.get(sorted).push(origi);
16    }
17    return Array.from(keep.values());
18};