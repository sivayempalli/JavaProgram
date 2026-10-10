package LeetCode_150.Stack;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    public static void main(String[] args) {

    }
}

class Evaluate_Reverse_Polish_Notation_Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();
        for(String str : tokens){
            if(str.equals("+")){
                Integer  b = st.pop();
                Integer  a = st.pop();
                Integer value = a + b;
                st.push(value);
            }
            else if(str.equals("-")){
                Integer  b = st.pop();
                Integer  a = st.pop();
                Integer value = a - b;
                st.push(value);
            }
            else if (str.equals("*")){
                Integer  b = st.pop();
                Integer  a = st.pop();
                Integer value = a * b;
                st.push(value);
            }
            else if(str.equals("/")){
                 Integer  b = st.pop();
                 Integer  a = st.pop();
                 Integer value = a / b;
                 st.push(value);
            }
            else{
                st.push(Integer.valueOf(str));
            }
        }

        return  st.peek();
    }
}
