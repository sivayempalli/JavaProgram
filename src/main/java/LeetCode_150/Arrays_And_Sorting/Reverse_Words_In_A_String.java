package LeetCode_150.Arrays_And_Sorting;

import java.util.List;

public class Reverse_Words_In_A_String {
    public static void main(String[] args) {
        System.out.println(new Reverse_Words_In_A_String_Solution().reverseWords("the sky is blue"));
        System.out.println(new Reverse_Words_In_A_String_Solution().reverseWords("  hello world  "));

    }
}

class Reverse_Words_In_A_String_Solution {
    public String reverseWords(String s) {
       String[] splitArray =   s.split(" ");
        //System.out.println(splitArray.length);
       StringBuilder result = new StringBuilder();

       for(int i = splitArray.length-1 ; i>=0 ; i--){
           if (splitArray[i] != null & !splitArray[i].isEmpty()){
               if (result.length() != 0){
                   result.append(" ");
               }
               result.append(splitArray[i]);
           }
       }

       return  result.toString();
    }
}
