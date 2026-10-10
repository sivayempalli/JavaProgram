package LeetCode_150.Stack;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Stack;

class MinStack {

    Stack<Integer> st;
    Stack<Integer> minStack;

    public MinStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        st.push(value);

        if(minStack.isEmpty() || value < minStack.peek()){
            minStack.push(value);
        }

    }

    public void pop() {
        if(st.pop().equals(minStack.peek())){
            minStack.pop();
        };
    }

    public int top() {
        return  st.peek();
    }

    public int getMin() {
        return  minStack.peek();
    }
}