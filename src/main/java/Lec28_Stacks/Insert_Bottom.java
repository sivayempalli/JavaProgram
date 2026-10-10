package Lec28_Stacks;

import java.util.Stack;

public class Insert_Bottom {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(13);
        st.push(14);
        st.push(15);

        Insert_Bot(st, -1);
        System.out.println(st);

    }

    private static  void  Insert_Bot(Stack<Integer> st , int item){

        if(st.empty()){
            st.push(item);
            return;
        }

        int ele = st.peek();
        st.pop();
        Insert_Bot(st, item);
        st.push(ele);

    }

}
