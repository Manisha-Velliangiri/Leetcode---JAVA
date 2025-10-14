// Last updated: 10/14/2025, 10:34:49 PM
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stackk= new Stack<>();

        for(int i=0;i<s.length();i++){
           
           char c = s.charAt(i);

           if(c=='('|| c=='[' || c=='{'){
              
              stackk.push(c);

           }else{
             if(stackk.isEmpty()) return false;

             char p=stackk.pop();
             
             if((c==')' && p!='(' )||
               (c==']' && p!='[' )||
               (c=='}' && p!='{' )){

                return false;

             }

           }

        }
        return stackk.isEmpty();

    }
}