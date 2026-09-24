// Last updated: 9/24/2026, 11:20:31 PM
1function isAnagram(s: string, t: string): boolean {
2    
3    if(s.length !== t.length){
4        return false;
5    }
6
7    const mapp = new Map<string,number>();
8
9    for(let i=0;i<s.length;i++){
10        const char = s[i];
11        mapp.set(char , (mapp.get(char) || 0) + 1 );
12    }
13
14    for(let i=0;i<t.length;i++){
15        const char = t[i];
16
17        if(!mapp.has(char)){
18            return false;
19        }
20        mapp.set(char , mapp.get(char)!-1);
21
22        if(mapp.get(char)!<0){
23            return false;
24        }
25    }
26    return true;
27}