package Lec29;

import java.util.Stack;

public class Construct_Smallest_Number_From_DI_String {
    public static void main(String[] args) {

        System.out.println(new Construct_Smallest_Number_From_DI_String_Solution().smallestNumber("IIIDIDDD"));

    }
}

class Construct_Smallest_Number_From_DI_String_Solution {
    public String smallestNumber(String pattern) {

        Stack<Integer> st = new Stack<>();
        int[] arr = new int[pattern.length() + 1];
        int count = 1;

        for(int i=0; i<= pattern.length(); i++){

            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                arr[i] = count++;
                while(!st.isEmpty()){
                    arr[st.pop()] = count++;
                }
            }else{
                st.push(i);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int j : arr) {
            result.append(j);
        }

        return result.toString();
    }
}