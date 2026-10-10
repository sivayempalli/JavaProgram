package LeetCode_150.DP;

import java.util.Arrays;

public class Coin_Change {

}

class Coin_Change_Solution {
    public int coinChange(int[] coins, int amount) {

        //bottom up approach
        int[][] dp  = new int[coins.length+1][amount+1];

        for(int[] a : dp) {
            Arrays.fill(a, 999999); // try to think in one dp
        }

        Arrays.sort(coins);
        //
        for(int i=1; i<=coins.length; i++){
            dp[i][0] = 0;
        }

        for(int i=1; i<=amount; i++){
            dp[0][1] = 999999;
        }

        for(int coin=1; coin<=coins.length; coin++){
            for(int eachAmount=1; eachAmount<=amount; eachAmount++){

                if( eachAmount >= coins[coin-1]){
                    int inclusiveStep =  1+ dp[coin][eachAmount - coins[coin-1]];
                    dp[coin][eachAmount] = Math.min(inclusiveStep, dp[coin][eachAmount]);
                }

                int exclusiveStep =  1+ dp[coin-1][eachAmount];
                dp[coin][eachAmount] = Math.min(exclusiveStep, dp[coin][eachAmount]);


            }
        }

        for(int i=0; i<=coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }

        return dp[coins.length][amount] == 999999 ? -1 : dp[coins.length][amount];

    }
}
