package Lec21_Recursive4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Letter_Combinations_Of_A_Phone_Number {
    public static void main(String[] args) {
        List<String> results = new Letter_Combinations_Of_A_Phone_Number_Solution().letterCombinations("2399");
        for(String result : results){
            System.out.println(result);
        }
    }
}

class Letter_Combinations_Of_A_Phone_Number_Solution {
    public static String[] digitToChars = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        permutationLetters(digits,0,"",results);
        return  results;
    }

    public void permutationLetters(String digits, int currentIndx, String output, List<String> results){
        //base
        if(digits.length() == currentIndx){
            results.add(output);
            return;
        }

        String permStr = digitToChars[digits.charAt(currentIndx) - '0'];

        for(int i=0; i<permStr.length(); i++){
            permutationLetters(digits,currentIndx+1,output+permStr.charAt(i), results);
        }

    }
}
