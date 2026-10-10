package LeetCode_150.DP_Multidimensional;

public class Best_Time_Buy_Sell_Stock_III {

}

class Best_Time_Buy_Sell_Stock_III_Solution {
    public int maxProfit(int[] prices) {

        int[][][] dp = new int[prices.length][2][3];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                for (int k = 0; k < dp[i][j].length; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return solve(prices, true, 2, 0, dp);
    }

    public int solve(int[] prices, boolean canBuy, int transaction, int currPos, int[][][] dp) {

        if (currPos == prices.length) {
            return 0;
        }

        if (transaction == 0) {
            return 0;
        }

        if (dp[currPos][canBuy ? 1 : 0][transaction] != -1) {
            return dp[currPos][canBuy ? 1 : 0][transaction];
        }

        int profit1 = 0;
        int profit2 = 0;

        if (canBuy) {
            profit1 = solve(prices, canBuy, transaction, currPos + 1, dp);
            profit2 = solve(prices, false, transaction, currPos + 1, dp) - prices[currPos];
        } else {
            profit1 = solve(prices, canBuy, transaction, currPos + 1, dp);
            profit2 = solve(prices, true, transaction - 1, currPos + 1, dp) + prices[currPos];
        }

        return dp[currPos][canBuy ? 1 : 0][transaction] = Math.max(profit1, profit2);

    }

}
