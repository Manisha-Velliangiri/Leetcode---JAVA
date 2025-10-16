// Last updated: 10/16/2025, 11:45:16 AM
class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> ans = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            
            if(c=='('){
                if(!ans.isEmpty()){

                    sb.append(c);
                }
                ans.push(c);
            }else if (c==')'){
                ans.pop();
                if(!ans.isEmpty()){
                  sb.append(c);
                }
            }
           
        }
         return sb.toString();
    }
}