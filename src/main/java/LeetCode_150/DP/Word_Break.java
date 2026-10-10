package LeetCode_150.DP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Word_Break {
    public static void main(String[] args) {

    }
}

class Word_Break_Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> dicSet = new HashSet<>(wordDict);

        int[] dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return wordBreakDp(s,0, dicSet,dp);

    }

    boolean wordBreakDp(String s, int startIndex , Set<String> dictSet,int[] dp){

        if(startIndex == s.length()){
            return  true;
        }

        if(dp[startIndex] != -1){
            return  dp[startIndex] == 1;
        }

        //StringBuilder str = new StringBuilder();
        for(int i=startIndex; i<s.length(); i++ ){
            String str =  s.substring(startIndex,i+1);// str.append(s.charAt(i));
            if(dictSet.contains(str)){
                if(wordBreakDp(s,i+1, dictSet,dp)){
                    dp[startIndex] = 1;
                    return  true;
                }
            }
        }

        dp[startIndex] = 0;
        return  false;
    }
}
