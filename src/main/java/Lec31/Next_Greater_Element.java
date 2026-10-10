package Lec31;

import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int[] arr = {50, 5 ,4,3,8,7,9, 1};
    }

    public  static int[]   findNGE(int[] arr){

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++){

            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }

        while (!st.empty()){
            ans[st.pop()] = -1;
        }

        return  ans;

    }
}


