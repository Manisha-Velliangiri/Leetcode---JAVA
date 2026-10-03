// Last updated: 10/3/2026, 11:21:35 PM
1function isPalindrome(s: string): boolean {
2    
3     s = s.toLowerCase();
4    s = s.replace(/[^a-z0-9]/g,"");
5
6    let left =0;
7    let right =s.length-1;
8
9    while(left<right){
10        
11        if(s[left]!==s[right]){
12            return false;
13        }
14        left++;
15        right--;
16    }
17    return true;
18
19
20
21};