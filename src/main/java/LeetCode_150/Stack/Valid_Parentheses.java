package LeetCode_150.Stack;

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {

        System.out.println(new Valid_Parentheses_Solution().isValid("()[]{}"));
        System.out.println(new Valid_Parentheses_Solution().isValid("()[]}"));
        System.out.println(new Valid_Parentheses_Solution().isValid("("));

    }
}

class Valid_Parentheses_Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else{

                if(st.isEmpty()){
                    return  false;
                }

                char open = st.pop();

                if(open == '(' && c == ')'){
                    continue;
                }
                else if(open == '{' && c == '}'){
                    continue;
                }
                else if (open == '[' && c == ']') {
                    continue;
                }
                else{
                    return  false;
                }
            }
        }

        if(!st.isEmpty()){
            return  false;
        }

        return  true;
    }
}
