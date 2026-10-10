package LeetCode_150.DP_Multidimensional;

public class Maximal_Square {
}


class Maximal_Square_Solution {
    public int maximalSquare(char[][] matrix) {

        int maxSquare = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row+1][col+1];


        for(int i=1; i<= row; i++){
            for(int j=1; j<=col; j++){

                if (matrix[i - 1][j - 1] == '0') {
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = 1 +  Math.min(dp[i-1][j-1] , Math.min(dp[i-1][j] , dp[i][j-1]));
                }

                maxSquare = Math.max(maxSquare,dp[i][j]);
            }
        }

        return maxSquare*maxSquare;

    }
}