package Lec29;

import java.util.Stack;

public class Find_The_Celebrity {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
        System.out.println(Celebrity(arr));
    }
    private static int Celebrity(int[][] arr) {
        Stack<Integer>  st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            st.push(i);
        }

        while(st.size() > 1){
            int firstCel  = st.pop();
            int secondCel = st.pop();

            if(arr[firstCel][secondCel] == 1){
                st.push(secondCel);
            }else{
                st.push(firstCel);
            }
        }

        int candidate = st.pop();
        for (int i = 0; i < arr.length; i++) {
            if (i == candidate) {
                continue;
            }
            if (arr[candidate][i] == 1 || arr[i][candidate] == 0) {
                return -1;
            }
        }
        return candidate;
    }
}
