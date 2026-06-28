package LeetCode_150.Two_Pointers;

public class Is_Subsequence {
    public static void main(String[] args) {
        System.out.println(new Is_Subsequence_Solution().isSubsequence("abc","ahbgdc"));
    }
}

class Is_Subsequence_Solution {
    public boolean isSubsequence(String s, String t) {

        int firstStringIndex = 0;
        int secondStringIndex = 0;

        while(firstStringIndex < s.length() && secondStringIndex < t.length()){

            if(s.charAt(firstStringIndex) == t.charAt(secondStringIndex)){
                firstStringIndex++;
                secondStringIndex++;
            }else{
                secondStringIndex++;
            }

        }

        if(firstStringIndex == s.length()){
            return  true;
        }
        return  false;
    }
}
