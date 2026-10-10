package Lec24_BackTracking_2;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        List<List<String>> resuls = new Palindrome_Partitioning_Solution().partition("nitin");
        for(List<String> result : resuls){
            System.out.println(result);
        }
    }
}

class Palindrome_Partitioning_Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result  = new ArrayList<>();
        partitionString(s , new ArrayList<>() , result);
        return  result;
    }

    public void partitionString(String question, List<String> ans , List<List<String>> result){

        if(question.isEmpty()){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int i=1; i<=question.length(); i++){
            String subString = question.substring(0,i);
            //System.out.println(subString);
            if(isPalindrome(subString)){
                ans.add(subString);
                partitionString(question.substring(i) , ans , result);
                ans.remove(ans.size() - 1);
            }
        }

    }

    public boolean isPalindrome(String str){

        int i = 0;
        int j = str.length() - 1;

        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return  false;
            }
            i++;
            j--;
        }

        return  true;
    }



}
