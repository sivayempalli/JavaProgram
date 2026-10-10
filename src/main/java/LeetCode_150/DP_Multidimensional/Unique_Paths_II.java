package LeetCode_150.DP_Multidimensional;

public class Unique_Paths_II {
    public static void main(String[] args) {

    }
}

class Unique_Paths_II_Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        int[] dp = new int[col];

        for(int i=0; i<col; i++){
            if(i == 0){
                dp[i]  = 1;
            }else{
                if(obstacleGrid[0][i] == 1) {
                    dp[i] = 0;
                }else{
                    dp[i] = dp[i-1];
                }
            }
        }
        for(int i=1; i<row; i++){
            for(int j=0; j<col; j++){

                if(j == 0){
                    if(obstacleGrid[i][j] == 1){
                        dp[j] = 0;
                    }
                }else{
                    if(obstacleGrid[i][j] == 1){
                        dp[j] = 0;
                    }else{
                        dp[j] = dp[j-1] + dp[j];
                    }
                }
            }
        }

        return dp[col-1];

    }
}
