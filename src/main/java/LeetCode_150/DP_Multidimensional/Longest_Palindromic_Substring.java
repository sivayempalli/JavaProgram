package LeetCode_150.DP_Multidimensional;

public class Longest_Palindromic_Substring {
    public static void main(String[] args) {

    }
}

class Longest_Palindromic_Substring_Solution {
    public String longestPalindrome(String s) {

        int len = 1;
        int endIndex  = 0;

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for(int i=0; i<s.length(); i++){

            for(int j = 0; j<=i; j++){ //length

                int subLen = j-i+1;

                if(subLen == 1){
                    dp[subLen] = true;
                }else if(s.charAt(i) == s.charAt(j)){
                    dp[subLen] = dp[subLen-2];

                    if(dp[subLen] && subLen > len){
                        len = subLen;
                        endIndex = i;
                    }
                }

                System.out.println(i +"  "+j+"   "+subLen+"  "+dp[subLen]);

            }

        }

        return  s.substring(endIndex-len+1, endIndex+1);

    }
}
