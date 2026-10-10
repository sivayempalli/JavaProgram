package Lec28_Stacks;

import java.util.Stack;

public class Reverse_Stack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(13);
        st.push(14);
        st.push(15);

        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }

    private static void Reverse(Stack<Integer> st){

        if(st.empty()){
            return;
        }

        int ele = st.peek();
        st.pop();
        Reverse(st);
        Insert_Bot(st, ele);
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
