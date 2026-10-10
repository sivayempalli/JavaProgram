package LeetCode_150.Stack;

import java.util.Stack;

public class Basic_Calculator {
    public static void main(String[] args) {
        System.out.println(new Basic_Calculator_Solution().calculate("(1+(4+5+2)-3)+(6+8))" ));
        System.out.println(new Basic_Calculator_Solution().calculate("2-1 + 2 " ));
        //System.out.println(new Basic_Calculator_Solution().calculate("2-1 + 2 " ));


    }
}

class Basic_Calculator_Solution {
    public int calculate(String s) {
        Stack<String> st = new Stack<>();

        int i = 0;
        while(i < s.length()){

            //System.out.println(i +"  "+s.charAt(i));

            if( s.charAt(i) == '('){
                st.push( String.valueOf(s.charAt(i)) );
            }
            else if(s.charAt(i) == ')'){

                //System.out.println(st);

               while ( st.size() > 1 ) {
                   Integer b = Integer.valueOf( st.pop() );
                   String op = st.pop();
                   if(op.equals("(")){
                       st.push( String.valueOf(b) );
                       break;
                   }
                   Integer a = Integer.valueOf( st.pop() );
                   Integer val;
                   switch (op) {
                       case "+":
                           val = a + b;
                           break;
                       case "-":
                           val = a - b;

                           break;
                       case "*":
                           val = a * b;
                           break;
                       default:
                           val = a / b;
                           break;
                   }
                   st.push(String.valueOf(val));

               }


            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                int num = 0;
                while(i < s.length()){

                    if(  s.charAt(i) >= '0' && s.charAt(i) <= '9' ) {
                        num = num * 10 + (s.charAt(i) - '0');
                        i++;
                    }
                    else{
                        st.push(String.valueOf(num));
                        break;
                    }
                }
                continue;
            }
            else if(s.charAt(i) == ' '){

            }
            else{
                st.push( String.valueOf(s.charAt(i) ));
            }

            i++;

        }

       while (st.size() > 1){
           System.out.println(st);
           Integer b = Integer.valueOf( st.pop() );
           String op = st.pop();
           Integer a = Integer.valueOf( st.pop() );
           Integer val;
           switch (op) {
               case "+":
                   val = a + b;
                   break;
               case "-":
                   val = a - b;

                   break;
               case "*":
                   val = a * b;
                   break;
               default:
                   val = a / b;
                   break;
           }
           st.push(String.valueOf(val));

       }

       return  Integer.parseInt(st.peek());
    }
}
