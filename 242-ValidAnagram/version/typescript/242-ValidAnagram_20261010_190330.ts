// Last updated: 10/10/2026, 7:03:30 PM
1function isAnagram(s: string, t: string): boolean {
2     
3    if(s.length!==t.length){
4        return false;
5    }
6
7    const keep = new Map<string , number>();
8
9    for(let i=0;i<s.length;i++){
10
11        keep.set(s[i],(keep.get(s[i]) || 0)+1);
12    }
13
14    for(let i=0;i<t.length;i++){
15
16        if(!keep.has(t[i])){
17            return false;
18
19        }else if(keep.has(t[i])){
20            if(keep.get(t[i])===0){
21                return false ;
22            }
23            keep.set(t[i],keep.get(t[i])!-1);
24        }
25    }
26    return true;
27
28};