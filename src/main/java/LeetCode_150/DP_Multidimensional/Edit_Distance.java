package LeetCode_150.DP_Multidimensional;

import java.util.Arrays;

public class Edit_Distance {

}

class Edit_Distance_Solution {
    public int minDistance(String word1, String word2) {

        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }
        return minDisOperation(word1,word2, 0 , 0, dp);

    }

    public int minDisOperation(String word1 , String word2, int indx1, int indx2, int[][] dp){

        if(indx1 == word1.length() && indx2 == word2.length()){
            return  0 ;
        }

        if(indx1 == word1.length()){
            return word2.length() - indx2 ;
        }

        if(indx2 == word2.length()){
            return word1.length() - indx1 ;
        }

        if(dp[indx1][indx2] != -1){
            return  dp[indx1][indx2];
        }

        if(word1.charAt(indx1) == word2.charAt(indx2)){
            return dp[indx1][indx2] = minDisOperation(word1,word2,indx1+1,indx2+1 , dp);
        }else {
           int insert = minDisOperation(word1, word2, indx1, indx2+1,dp);
           int delete = minDisOperation(word1, word2, indx1+1, indx2,dp);
           int replace = minDisOperation(word1,word2, indx1+1,indx2+1,dp);
           return  dp[indx1][indx2] =  1 +  Math.min(insert, Math.min(delete,replace));
        }

    }

}
